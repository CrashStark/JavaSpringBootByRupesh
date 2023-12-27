package com.example.Patient.PatientModuleMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PatientModuleMsApplication {

	public static void main(String[] args) {
		System.out.println("Inside Patient Modules");
		SpringApplication.run(PatientModuleMsApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
