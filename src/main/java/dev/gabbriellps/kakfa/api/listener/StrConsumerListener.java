package dev.gabbriellps.kakfa.api.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StrConsumerListener {


    @KafkaListener(groupId = "group-1",
            topicPartitions = {
                @TopicPartition(topic = "first-topic", partitions =  {"0"})
            }, containerFactory = "strContainerFactory")
    public void listener1(String message) {
        log.info("Listener 1 ::: group 1");
    }

    @KafkaListener(groupId = "group-1",
            topicPartitions = {
            @TopicPartition(topic = "first-topic", partitions =  {"1"})
    }, containerFactory = "strContainerFactory")
    public void listener2(String message) {
        log.info("Listener 2 ::: group 1");
    }

    @KafkaListener(groupId = "group-2", topics = "first-topic", containerFactory = "strContainerFactory")
    public void listener3(String message) {
        log.info("Listener 3 ::: group 2");
    }

}
