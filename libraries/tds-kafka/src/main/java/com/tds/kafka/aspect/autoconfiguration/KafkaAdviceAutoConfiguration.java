package com.tds.kafka.aspect.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.tds.kafka.aspect.advice.KafkaExceptionHandlingAspect;

@AutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)  
public class KafkaAdviceAutoConfiguration {

    @Bean
    //@ConditionalOnBean(annotation = KafkaControllerAdvice.class)
    public KafkaExceptionHandlingAspect kafkaExceptionHandlingAspect(ApplicationContext context) {
        return new KafkaExceptionHandlingAspect(context);
    }

}
