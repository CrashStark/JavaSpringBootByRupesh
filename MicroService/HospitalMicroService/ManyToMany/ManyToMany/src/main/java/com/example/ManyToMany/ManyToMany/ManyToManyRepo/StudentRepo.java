package com.example.ManyToMany.ManyToMany.ManyToManyRepo;

import com.example.ManyToMany.ManyToMany.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
