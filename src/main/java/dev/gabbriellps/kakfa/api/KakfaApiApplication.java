package dev.gabbriellps.kakfa.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KakfaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakfaApiApplication.class, args);
	}

}
