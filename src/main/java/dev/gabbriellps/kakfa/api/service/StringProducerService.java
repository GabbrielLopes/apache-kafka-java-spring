package dev.gabbriellps.kakfa.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("first-topic", message);
    }

}
