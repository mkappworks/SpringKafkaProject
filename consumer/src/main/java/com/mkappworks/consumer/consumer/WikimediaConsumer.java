package com.mkappworks.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeStreamMessage(String message) {
        log.info("Consuming message from wikimedia {}", message);
        // Please feel free to do anything with the data
    }
}
