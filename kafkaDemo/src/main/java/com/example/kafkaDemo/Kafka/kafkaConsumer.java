package com.example.kafkaDemo.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(kafkaConsumer.class);

    @KafkaListener(topics = "JavaGuide", groupId = "myGroup")
    public void consume(String message){

        logger.info(String.format("Message received -> %s",message));

    }
}
