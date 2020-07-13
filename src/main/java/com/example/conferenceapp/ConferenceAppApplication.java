package com.example.conferenceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.conferenceapp"})

public class ConferenceAppApplication {

	// pass this option to set prod profile (uses application-prod.properties): -Dspring.profiles.active=prod
	public static void main(String[] args) {
		SpringApplication.run(ConferenceAppApplication.class, args);
	}

}
