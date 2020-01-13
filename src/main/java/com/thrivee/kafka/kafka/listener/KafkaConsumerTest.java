package com.thrivee.kafka.kafka.listener;


import com.thrivee.kafka.kafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerTest {

    @KafkaListener(topics = "Kafka_test", groupId = "group_id")
    public String consume(String message) {
        System.out.println("Consumed message: " + message);

        return message;
    }


    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }

}
