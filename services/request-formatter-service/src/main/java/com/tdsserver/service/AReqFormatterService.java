package com.tdsserver.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tds.entities.message.TdsMessage;
import com.tds.entities.message.request.areq.AReq2_1;
import com.tds.entities.message.request.areq.AReq2_2;
import com.tds.entities.message.request.areq.AReq2_3;
import com.tds.entities.message.response.ares.ARes2_1;
import com.tds.entities.message.response.ares.ARes2_2;
import com.tds.entities.message.response.ares.ARes2_3;
import com.tds.kafka.message.KafkaTdsEnvelop;
import com.tds.kafka.message.KafkaTdsHeaders;

@Service
public class AReqFormatterService {
	//private static final Logger logger = LoggerFactory.getLogger(AReqFormatterService.class);
	private final KafkaTemplate<String, KafkaTdsEnvelop> kafkaTemplate;
	private final ObjectMapper mapper = new ObjectMapper();
	
	public AReqFormatterService(KafkaTemplate<String, KafkaTdsEnvelop> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryAReq_2_1")
	public void formatAReq2_1(@Payload KafkaTdsEnvelop envolop) {
		// TODO: convert the received message into an EMVCo 3ds format
		AReq2_1 areq = null;
		try {
			areq = mapper.readValue(envolop.message(), AReq2_1.class);
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publisMessage(areq, envolop.correlationID(),"request-formatted");
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryAReq_2_2")
	public void formatAReq2_2(@Payload KafkaTdsEnvelop envolop) {
		// TODO: convert the received message into an EMVCo 3ds format
		AReq2_2 areq = null;
		try {
			areq = mapper.readValue(envolop.message(), AReq2_2.class);
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publisMessage(areq, envolop.correlationID(),"request-formatted");
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryAReq_2_3")
	public void formatAReq2_3(@Payload KafkaTdsEnvelop envolop) {
		// TODO: convert the received message into an EMVCo 3ds format
		AReq2_3 areq = null;
		try {
			areq = mapper.readValue(envolop.message(), AReq2_3.class);
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publisMessage(areq, envolop.correlationID(),"request-formatted");
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryARes_2_1")
	public void formatARes2_1(@Payload KafkaTdsEnvelop envolop) {
		// TODO: convert the received message into an EMVCo 3ds format
		ARes2_1 ares = null;
		try {
			ares = mapper.readValue(envolop.message(), ARes2_1.class);
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publisMessage(ares, envolop.correlationID(),"response-formatted");
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryARes_2_2")
	public void formatARes2_2(@Payload KafkaTdsEnvelop envolop) {
		// TODO: convert the received message into an EMVCo 3ds format
		ARes2_2 ares = null;
		try {
			ares = mapper.readValue(envolop.message(), ARes2_2.class);
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publisMessage(ares, envolop.correlationID(),"response-formatted");
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryARes_2_3")
	public void formatARes2_3(@Payload KafkaTdsEnvelop envolop) {
		// TODO: convert the received message into an EMVCo 3ds format
		ARes2_3 ares = null;
		try {
			ares = mapper.readValue(envolop.message(), ARes2_3.class);
		}  catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publisMessage(ares, envolop.correlationID(),"response-formatted");
	}
	
	public void publisMessage(TdsMessage tdsMessage, String correlationId, String topic) {
		Message<KafkaTdsEnvelop> message = null;
		try {
			message = MessageBuilder
					.withPayload(new KafkaTdsEnvelop(correlationId, tdsMessage.getMessageType(),
							tdsMessage.getMessageVersion(), tdsMessage.getThreeDSServerTransID(),mapper.writeValueAsString(tdsMessage)))
					.setHeader(KafkaHeaders.TOPIC, topic)
					.setHeader(KafkaTdsHeaders.MESSAGE_TYPE, tdsMessage.getMessageType())
					.setHeader(KafkaTdsHeaders.MESSAGE_VERSION, tdsMessage.getMessageVersion())
					.setHeader(KafkaTdsHeaders.THREE_DS_SERVER_TRANS_ID, tdsMessage.getThreeDSServerTransID())
					.setHeader(KafkaTdsHeaders.CORRELATION_ID, correlationId)
					.build();
		} catch (JsonProcessingException e) {
			// TODO throw an exception
			
			e.printStackTrace();
		}
		kafkaTemplate.send(message);
	}
	
}
