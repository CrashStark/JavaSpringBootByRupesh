package com.example.FakeMapping.FakeMapping.Services;

import com.example.FakeMapping.FakeMapping.Entity.Laptop;
import com.example.FakeMapping.FakeMapping.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SaveStudentDetails {


    Laptop l1=new Laptop(1,"Dell");
    Laptop l2=new Laptop(2, "HP");
    List<Laptop> list=new ArrayList<Laptop>();

    public SaveStudentDetails() {
        list.add(l1);
        list.add(l2);
    }

    Student s1=new Student(1,"Rahul", "Sharma",list);

    public Student getStudent(){
        return  s1;
    }

    public Student SetStudent(Student student1){
       Student s2=new Student();
       s2.setStudentID((student1.getStudentID()));
       s2.setStudentName(student1.getStudentName());
       s2.setStudentLastName(student1.getStudentLastName());
       s2.setLaptop(student1.getLaptop());
        System.out.println(s2.toString());
        System.out.println("Student has been Added");
        return s2;
    }
}
