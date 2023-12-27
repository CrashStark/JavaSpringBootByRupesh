package com.MappingPractice.MappingPractice.StudentRepository;

import com.MappingPractice.MappingPractice.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
