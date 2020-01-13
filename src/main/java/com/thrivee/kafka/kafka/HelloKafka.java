package com.thrivee.kafka.kafka;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloKafka {

    @RequestMapping("/")
    public String index() {
        return "Hello Kafka";
    }
}
