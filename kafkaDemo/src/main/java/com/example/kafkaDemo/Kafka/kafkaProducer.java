package com.example.kafkaDemo.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(kafkaProducer.class);
    private KafkaTemplate<String,String> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(String message){

        logger.info(String.format("Message sent %s",message));
        kafkaTemplate.send("JavaGuide",message);
    }
}
