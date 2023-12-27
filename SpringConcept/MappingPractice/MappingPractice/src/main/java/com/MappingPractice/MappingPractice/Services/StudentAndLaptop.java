package com.MappingPractice.MappingPractice.Services;

import com.MappingPractice.MappingPractice.Entity.Laptop;
import com.MappingPractice.MappingPractice.Entity.Student;
import com.MappingPractice.MappingPractice.StudentRepository.LaptopRepository;
import com.MappingPractice.MappingPractice.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAndLaptop {
    @Autowired
    LaptopRepository laptopRepository;
    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Laptop saveLaptop(Laptop laptop){
        return  laptopRepository.save(laptop);
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public List<Laptop> getAllLaptop(){
        return laptopRepository.findAll();
    }
    @Autowired
    public StudentAndLaptop(LaptopRepository laptopRepository, StudentRepository studentRepository) {
        this.laptopRepository = laptopRepository;
        this.studentRepository = studentRepository;
    }

    public void saveStudentWithLaptop(Laptop laptop) {
        // Save the student first
        Student student=laptop.getStudent();
        studentRepository.save(student);

        // Set the student for the laptop
        laptop.setStudent(student);

        // Save the laptop
        laptopRepository.save(laptop);
    }
}
