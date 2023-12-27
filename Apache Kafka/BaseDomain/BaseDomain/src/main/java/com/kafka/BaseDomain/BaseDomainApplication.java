package com.kafka.BaseDomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseDomainApplication {

	public static void main(String[] args) {
		System.out.println("Inside BaseDomain");
		SpringApplication.run(BaseDomainApplication.class, args);
	}

}
