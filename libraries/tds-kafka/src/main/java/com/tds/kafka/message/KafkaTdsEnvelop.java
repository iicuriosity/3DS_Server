package com.tds.kafka.message;


public record KafkaTdsEnvelop (String correlationID, String messageType, String messageVersion, String threeDSServerTransID, String message) {
	

}
