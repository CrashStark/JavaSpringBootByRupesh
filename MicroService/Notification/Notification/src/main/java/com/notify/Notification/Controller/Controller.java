package com.notify.Notification.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@PostMapping("/notify")
	public void notification() {
		System.out.println("Student Data has been get");
	}

	@PostMapping("/notifyAdd")
	public void addStudent(){
		System.out.println("Student has been Added");
	}
}
