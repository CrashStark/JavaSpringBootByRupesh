package com.MappingPractice.MappingPractice.Controller;

import com.MappingPractice.MappingPractice.Entity.Laptop;
import com.MappingPractice.MappingPractice.Entity.Student;
import com.MappingPractice.MappingPractice.Entity.User;
import com.MappingPractice.MappingPractice.Services.StudentAndLaptop;
import com.MappingPractice.MappingPractice.Services.UserAndSocialApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentAndLaptop studentAndLaptop;
    @Autowired
    UserAndSocialApp userAndSocialApp;
    @GetMapping("/hello")
    public String greeting(){
        return "Hello User";
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody  Student student){
        Student student1=studentAndLaptop.saveStudent(student);
        return  student1;
    }
    @PostMapping("/addLaptop")
    public String addLaptop(@RequestBody  Laptop laptop){
       studentAndLaptop.saveStudentWithLaptop(laptop);
       return "Student Is saved";
    }

    @GetMapping("/allStudents")
    public List<Student> getAllStudent(){
        List<Student> students=studentAndLaptop.getAllStudent();
        return students;
    }
    @GetMapping("/allLaptops")
    public List<Laptop> getAllLaptops(){
        List<Laptop> laptops=studentAndLaptop.getAllLaptop();
        return laptops;
    }

    @PostMapping("/addUserAndSocial")
    public String saveUser(@RequestBody User user){
        userAndSocialApp.userAndSocialApps(user);
        return "User Has been Saved";
    }
}
