package dev.gabbriellps.kakfa.api.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("first-topic", message);
        log.info("Message sent {}", message);
//                .addCallback(
//                success -> log.info("Message sent succefully {}", message),
//                error -> log.error("Error send message")
//        );
    }

}
