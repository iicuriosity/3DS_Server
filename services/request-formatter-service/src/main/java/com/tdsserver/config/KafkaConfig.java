package com.tdsserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;

import com.tds.entities.constants.MessageType;
import com.tds.kafka.message.KafkaTdsEnvelop;
import com.tdsserver.filter.MessageFilter;

@Configuration
public class KafkaConfig {

	private static final String VERSION_2_1 = "2.1.0";
	private static final String VERSION_2_2 = "2.2.0";
	private static final String VERSION_2_3 = "2.3.1";

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryAReq_2_1(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.AReq, VERSION_2_1));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryAReq_2_2(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.AReq, VERSION_2_2));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryAReq_2_3(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.AReq, VERSION_2_3));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryRReq_2_1(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.RReq, VERSION_2_1));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryRReq_2_2(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.RReq, VERSION_2_2));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryRReq_2_3(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.RReq, VERSION_2_3));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryARes_2_1(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.ARes, VERSION_2_1));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryARes_2_2(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.ARes, VERSION_2_2));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryARes_2_3(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.ARes, VERSION_2_3));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryRRes_2_1(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.RRes, VERSION_2_1));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryRRes_2_2(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.RRes, VERSION_2_2));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryRRes_2_3(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.RRes, VERSION_2_3));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryOReq_2_1(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.OReq, VERSION_2_1));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryOReq_2_2(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.OReq, VERSION_2_2));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryOReq_2_3(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.OReq, VERSION_2_3));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryORes_2_1(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.ORes, VERSION_2_1));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryORes_2_2(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.ORes, VERSION_2_2));
		return factory;
	}

	@Bean
	ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> kafkaListenerContainerFactoryORes_2_3(
			ConsumerFactory<String, KafkaTdsEnvelop> consumerFactory) {
		ConcurrentKafkaListenerContainerFactory<String, KafkaTdsEnvelop> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		factory.setRecordFilterStrategy(new MessageFilter(MessageType.ORes, VERSION_2_3));
		return factory;
	}
}
