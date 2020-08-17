package com.codev.registrationproxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@Slf4j
public class RegistrationProxyApplication {

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(RegistrationProxyApplication.class);
		final Environment env = app.run(args).getEnvironment();
		logConfiguration(env);
	}

	private static void logConfiguration(final Environment env) {
		log.info("#################################################################");
		log.info("Kafka broker host: {}", env.getRequiredProperty(
				"kafka.bootstrap.servers"));
		log.info("Kafka topic name: {}", env.getRequiredProperty(
				"kafka.topic.name"));
		log.info("#################################################################");
	}

}
