package com.mkappworks.kafkademo.consumer;

import com.mkappworks.kafkademo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "mk", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "mk-json", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info("Consumed message as Json: {}", student);
    }
}
