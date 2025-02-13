package dev.gabbriellps.kakfa.api.listener;

import dev.gabbriellps.kakfa.api.custom.StrConsumerCustomListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StrConsumerListener {


    @StrConsumerCustomListener(groupId = "group-1")
    public void listener1(String message) {
        log.info("Listener 1 ::: group 1");
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void listener2(String message) {
        log.info("Listener 2 ::: group 1");
    }

    @KafkaListener(groupId = "group-2", topics = "first-topic", containerFactory = "validateMessageContainerFactory")
    public void listener3(String message) {
        log.info("Listener 3 ::: group 2");
    }

}
