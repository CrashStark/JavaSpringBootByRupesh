package com.Practice.PracticeQuestion;

import com.Practice.PracticeQuestion.Controller.ApplicationClass;
import com.Practice.PracticeQuestion.Entity.Building;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeQuestionApplication {

	public static void main(String[] args) {
		System.out.println("Inside PracticeQuestionApplication");
		ApplicationClass applicationClass=new ApplicationClass();
		applicationClass.applicationMethod();
		SpringApplication.run(PracticeQuestionApplication.class, args);
	}

}
