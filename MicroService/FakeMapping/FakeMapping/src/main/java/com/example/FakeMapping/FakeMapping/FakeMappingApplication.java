package com.example.FakeMapping.FakeMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakeMappingApplication {

	public static void main(String[] args) {
		System.out.println("Fake Service Running");
		SpringApplication.run(FakeMappingApplication.class, args);
	}

}
