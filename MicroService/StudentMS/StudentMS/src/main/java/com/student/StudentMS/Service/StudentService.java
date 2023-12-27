package com.student.StudentMS.Service;

import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.student.StudentMS.Entity.Student;

@org.springframework.stereotype.Service
public class StudentService {
	
	List <Student> student=List.of(
			new Student(1, "Sanam", "Puri"),
			new Student(2, "Akash","Sharma"),
			new Student(3, "Rahul", "Malholtra")
			);
	Student student1=new Student(4,"Avinash","Singh");
	List<Student> student2=new ArrayList<Student>();

	public Student getStudentByUd(Integer Id) {
		System.out.println("Inside getStudent");
		return student.stream().filter(student->Id.equals(student.getId())).findAny().orElse(null);
	}

	public Boolean addStudent(Student student3d){
		System.out.println(student3d.toString());
		student2.add(student1);
		return student2.add(student3d);

	}
}
