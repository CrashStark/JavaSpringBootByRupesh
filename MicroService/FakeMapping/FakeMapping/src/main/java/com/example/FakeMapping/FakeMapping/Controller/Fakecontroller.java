package com.example.FakeMapping.FakeMapping.Controller;


import com.example.FakeMapping.FakeMapping.Entity.Student;
import com.example.FakeMapping.FakeMapping.Services.SaveStudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fakecontroller {
    @Autowired
    SaveStudentDetails studentService;

    @GetMapping("/greet")
    public  String getGreetings(){
        return "Hello User";
    }

    @GetMapping("/getStudent")
    public Student getStudent(){
        return studentService.getStudent();
    }

    @PostMapping("/setStudent")
    public Student setStudent(@RequestBody Student student){
        Student s1=studentService.SetStudent(student);
        return s1;
    }

}
