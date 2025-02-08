package dev.gabbriellps.kakfa.api.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;

@Configuration
public class KafkaAdminConfig {

    public final KafkaProperties properties;

    public KafkaAdminConfig(KafkaProperties properties) {
        this.properties = properties;
    }


    @Bean
    public KafkaAdmin kafkaAdmin() {
        HashMap<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());

        return new KafkaAdmin(configs);
    }

    @Bean
    public KafkaAdmin.NewTopics topics() {
        return new KafkaAdmin.NewTopics(
                TopicBuilder.name("first-topic")
                        .partitions(2)
                        .replicas(1)
                        .build()
        );
    }

}
