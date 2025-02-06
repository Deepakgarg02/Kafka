package com.endUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class EndUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndUserApplication.class, args);
	}

}
