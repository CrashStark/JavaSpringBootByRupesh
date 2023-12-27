package com.example.ManyToMany.ManyToMany.Controller;

import com.example.ManyToMany.ManyToMany.Entity.Courses;
import com.example.ManyToMany.ManyToMany.Entity.Student;
import com.example.ManyToMany.ManyToMany.Services.StudentAndCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class ManyToManyController {
    @Autowired
    StudentAndCourse studentAndCourse;
    @GetMapping("/hello")
    public String greetings(){
        return "Hello World";
    }
    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
    Student student1=studentAndCourse.saveStudent(student);
    return ResponseEntity.status(200).body(student1);
    }
    @PostMapping("/addCourse")
    public ResponseEntity<Courses> addStudent(@RequestBody Courses courses){
        Courses courses1=studentAndCourse.saveCourse(courses);
        return ResponseEntity.status(200).body(courses1);
    }


    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> students=studentAndCourse.getAllStudent();
        return ResponseEntity.status(200).body(students);
    }

    @GetMapping("/getCourses")
    public ResponseEntity<List<Courses>> getAllCourse(){
        List<Courses> courses=studentAndCourse.getAllCourese();
        return ResponseEntity.status(200).body(courses);
    }

}
