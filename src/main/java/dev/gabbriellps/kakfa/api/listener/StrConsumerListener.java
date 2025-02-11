package dev.gabbriellps.kakfa.api.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StrConsumerListener {


    @KafkaListener(groupId = "group-1", topics = "first-topic", containerFactory = "strContainerFactory")
    public void listener(String message) {
        log.info("Received message {}", message);
    }

}
