package com.tdsserver.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.tds.kafka.message.KafkaTdsEnvelop;


@Service
public class RReqFormatterService {

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryRReq_2_1")
	public void formatRReq2_1(@Payload KafkaTdsEnvelop message) {
		// Logic to format the request
		System.out.println("Formatted Request: " + message);
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryRReq_2_2")
	public void formatRReq2_2(@Payload KafkaTdsEnvelop message) {
		// TODO: convert the received message into an EMVCo 3ds format
		// Logic to format the request

		System.out.println("Formatted Request: " + message);
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryRReq_2_3")
	public void formatRReq2_3(@Payload KafkaTdsEnvelop message) {
		// TODO: convert the received message into an EMVCo 3ds format
		// TODO: convert the received message into an EMVCo 3ds format
		// Logic to format the request

		System.out.println("Formatted Request: " + message);
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryRRes_2_1")
	public void formatRRes2_1(@Payload KafkaTdsEnvelop message) {
		// TODO: convert the received message into an EMVCo 3ds format
		// Logic to format the request

		System.out.println("Formatted Request: " + message);
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryRRes_2_2")
	public void formatRRes2_2(@Payload KafkaTdsEnvelop message) {
		// TODO: convert the received message into an EMVCo 3ds format
		// Logic to format the request

		System.out.println("Formatted Request: " + message);
	}

	@KafkaListener(topics = "request-received-default-channel", groupId = "request-formatter-group", containerFactory = "kafkaListenerContainerFactoryRRes_2_3")
	public void formatRRes2_3(@Payload KafkaTdsEnvelop message) {
		// TODO: convert the received message into an EMVCo 3ds format
		// Logic to format the request
		System.out.println("Formatted Request: " + message);
	}
	
}
