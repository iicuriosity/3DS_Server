package com.tdsserver.filter;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.adapter.RecordFilterStrategy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tds.kafka.message.KafkaTdsEnvelop;

public class MessageFilter implements RecordFilterStrategy<String, KafkaTdsEnvelop> {

    private final String messageType;
    private final String messageVersion;
    

    public MessageFilter(String messageType, String messageVersion) {
        this.messageType = messageType;
        this.messageVersion = messageVersion;
    }

    @Override
    public boolean filter(ConsumerRecord<String, KafkaTdsEnvelop> consumerRecord) {
        try {
            JsonNode rootNode = new ObjectMapper().readTree(consumerRecord.value().message());
            return !rootNode.has("messageType") || !rootNode.get("messageType").asText().equals(messageType)
            		||!rootNode.has("messageVersion") || !rootNode.get("messageVersion").asText().equals(messageVersion);
        } catch (IOException e) {
            // Handle JSON parsing exception, maybe log it and return true to filter out the message
            return true;
        }
    }
}