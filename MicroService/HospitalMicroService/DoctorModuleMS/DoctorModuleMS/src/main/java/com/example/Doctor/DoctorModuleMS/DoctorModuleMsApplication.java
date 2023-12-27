package com.example.Doctor.DoctorModuleMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DoctorModuleMsApplication {

	public static void main(String[] args) {
		System.out.println("Inside DoctorModules");
		SpringApplication.run(DoctorModuleMsApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


}
