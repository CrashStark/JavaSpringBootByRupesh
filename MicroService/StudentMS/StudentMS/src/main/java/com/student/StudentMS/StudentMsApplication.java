package com.student.StudentMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.student.StudentMS")
public class StudentMsApplication {

	public static void main(String[] args) {
		System.out.println("StudentMsApplication.main()");
		SpringApplication.run(StudentMsApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}


}
