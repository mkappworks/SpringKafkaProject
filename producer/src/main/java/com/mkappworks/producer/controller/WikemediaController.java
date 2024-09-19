package com.mkappworks.producer.controller;

import com.mkappworks.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/wikimedia")
@RequiredArgsConstructor
public class WikemediaController {
    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublish() {
        streamConsumer.consumeStreamAndPublish();
    }
}
