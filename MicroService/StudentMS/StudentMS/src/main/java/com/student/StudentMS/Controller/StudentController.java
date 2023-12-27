package com.student.StudentMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.student.StudentMS.Entity.Student;
import com.student.StudentMS.Service.StudentService;

@RestController
@RequestMapping("/get")

public class StudentController {
	
	@Autowired
	 private StudentService studentService;
	@Autowired
	 private  RestTemplate restTemplate;
	 
	@Autowired
    public StudentController(StudentService studentService, RestTemplate restTemplate) {
        this.studentService = studentService;
        this.restTemplate = restTemplate;
    }
	 Student stdt;
	@GetMapping("/hello")
//	@ResponseBody
	public String getGreetings() {
		return "Hello User";
	}
	
	@GetMapping("getData/{id}")
	public Student getStudent(@PathVariable int id) {
		stdt=studentService.getStudentByUd(id);
		String notificationUrl = "http://localhost:8000/notify"; // assuming 'notification-service' is the host name
        restTemplate.postForObject(notificationUrl, "Student get with ID: " + stdt.getId(), String.class);
		return stdt;
	}

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student){
		boolean std=studentService.addStudent(student);
		System.out.println(std);
		String notificationUrl = "http://localhost:8000/notifyAdd"; // assuming 'notification-service' is the host name
		restTemplate.postForObject(notificationUrl, "Student get with ID: " + student.getId(), String.class);
		return "Student has been saved";
	}
}
