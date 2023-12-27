package com.example.ManyToMany.ManyToMany.Services;

import com.example.ManyToMany.ManyToMany.Entity.Courses;
import com.example.ManyToMany.ManyToMany.Entity.Student;
import com.example.ManyToMany.ManyToMany.ManyToManyRepo.CoursesRepo;
import com.example.ManyToMany.ManyToMany.ManyToManyRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAndCourse {
    @Autowired
    CoursesRepo coursesRepo;
    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        Student student1=studentRepo.save(student);
        System.out.println("Student Has been saved");
        return student1;
    }

    public Courses saveCourse(Courses courses){
        Courses courses1=coursesRepo.save(courses);
        System.out.println("Course Has been saved");
        return courses1;
    }

    public List<Student> getAllStudent(){
         List<Student> student=studentRepo.findAll();
         return student;
    }

    public List<Courses> getAllCourese(){
        List<Courses> courses=coursesRepo.findAll();
        return courses;
    }
}
