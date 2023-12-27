package com.MappingPractice.MappingPractice.StudentRepository;

import com.MappingPractice.MappingPractice.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
