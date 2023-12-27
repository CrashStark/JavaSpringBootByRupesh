package com.kafka.EmailService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailServiceApplication {

	public static void main(String[] args) {
		System.out.println("Inside EmailService");
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
