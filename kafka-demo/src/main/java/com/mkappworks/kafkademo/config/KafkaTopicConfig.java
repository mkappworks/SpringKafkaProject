package com.mkappworks.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic mkTopic() {
        return TopicBuilder
                .name("mk")
//                .partitions(5)
//                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic mkJsonTopic() {
        return TopicBuilder
                .name("mk-json")
                .build();
    }
}

