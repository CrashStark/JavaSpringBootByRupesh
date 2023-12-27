package com.example.ManyToMany.ManyToMany.ManyToManyRepo;

import com.example.ManyToMany.ManyToMany.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Integer> {
}
