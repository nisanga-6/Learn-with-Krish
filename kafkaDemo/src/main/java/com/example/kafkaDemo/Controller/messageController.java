package com.example.kafkaDemo.Controller;

import com.example.kafkaDemo.Kafka.kafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/kafka")
@CrossOrigin
public class messageController {


    kafkaProducer kafkaProducer;

    public messageController(com.example.kafkaDemo.Kafka.kafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //https://localhost:8085/api/v1/kafka/publish?message="Hello World"
    @GetMapping(path = "/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){

        kafkaProducer.send(message);
        return ResponseEntity.ok("Message Sent");
    }
}
