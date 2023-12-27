package com.MappingPractice.MappingPractice.StudentRepository;

import com.MappingPractice.MappingPractice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
