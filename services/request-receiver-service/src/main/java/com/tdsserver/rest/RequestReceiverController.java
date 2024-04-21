package com.tdsserver.rest;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tds.kafka.message.KafkaTdsEnvelop;
import com.tds.kafka.message.KafkaTdsHeaders;

@RestController
public class RequestReceiverController {

	private static final Logger logger = LoggerFactory.getLogger(RequestReceiverController.class);
	private final KafkaTemplate<String, KafkaTdsEnvelop> kafkaTemplate;

	private Map<String, DeferredResult<ResponseEntity<String>>> deferredResults = new ConcurrentHashMap<>();

	public RequestReceiverController(KafkaTemplate<String, KafkaTdsEnvelop> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	@PostMapping("/request1")
	public String handleRequest1(@RequestBody String request) {
		// Log the request for now; later you will publish this to a Kafka topic
		logger.info("Received request: {}", request);
		String threeDSServerTransID = getFieldTypeFromPayload(request, "threeDSServerTransID");

		threeDSServerTransID = threeDSServerTransID != null ? threeDSServerTransID : UUID.randomUUID().toString();
		String correlationID = UUID.randomUUID().toString();

		Message<String> message = MessageBuilder.withPayload(request)
				.setHeader(KafkaHeaders.TOPIC, "request-received-default-channel")
				.setHeader(KafkaTdsHeaders.MESSAGE_TYPE, getFieldTypeFromPayload(request, "messageType"))
				.setHeader(KafkaTdsHeaders.MESSAGE_VERSION, getFieldTypeFromPayload(request, "messageVersion"))
				.setHeader(KafkaTdsHeaders.THREE_DS_SERVER_TRANS_ID, threeDSServerTransID)
				.setHeader(KafkaTdsHeaders.CORRELATION_ID, correlationID).build();

		kafkaTemplate.send(message);
		// kafkaTemplate.send("request-received-default-channel", request);
		return "Request processed";
	}

	@PostMapping("/request")
	public DeferredResult<ResponseEntity<String>> handleRequest(@RequestBody String request) {
		// Log the request for now; later you will publish this to a Kafka topic
		logger.info("Received request: {}", request);

		String threeDSServerTransID = getFieldTypeFromPayload(request, "messageType");

		threeDSServerTransID = threeDSServerTransID != null ? threeDSServerTransID : UUID.randomUUID().toString();

		DeferredResult<ResponseEntity<String>> deferredResult = new DeferredResult<>();
		String correlationID = UUID.randomUUID().toString();
		deferredResults.put(correlationID, deferredResult);

		Message<KafkaTdsEnvelop> message = MessageBuilder
				.withPayload(new KafkaTdsEnvelop(correlationID, getFieldTypeFromPayload(request, "messageType"),
						getFieldTypeFromPayload(request, "messageVersion"), threeDSServerTransID, request))
				.setHeader(KafkaHeaders.TOPIC, "request-received-default-channel")
				.setHeader(KafkaTdsHeaders.MESSAGE_TYPE, getFieldTypeFromPayload(request, "messageType"))
				.setHeader(KafkaTdsHeaders.MESSAGE_VERSION, getFieldTypeFromPayload(request, "messageVersion"))
				.setHeader(KafkaTdsHeaders.THREE_DS_SERVER_TRANS_ID, threeDSServerTransID)
				.setHeader(KafkaTdsHeaders.CORRELATION_ID, correlationID).build();

		kafkaTemplate.send(message);
		return deferredResult;
	}

	private String getFieldTypeFromPayload(String payload, String field) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(payload);
		} catch (IOException e) {
			return null;
		}
		JsonNode messageTypeNode = rootNode.path(field);
		if (messageTypeNode.isMissingNode()) {
			return null;
		} else {
			return messageTypeNode.asText();
		}
	}

	@KafkaListener(topics = "response-ready-default-channel")
	public void handleResponse(KafkaTdsEnvelop response) {
		String correlationID = response.correlationID();
		DeferredResult<ResponseEntity<String>> deferredResult = deferredResults.get(correlationID);
		if (deferredResult != null) {
			deferredResult.setResult(ResponseEntity.ok(response.message()));
			deferredResults.remove(correlationID);
		}
	}
}
