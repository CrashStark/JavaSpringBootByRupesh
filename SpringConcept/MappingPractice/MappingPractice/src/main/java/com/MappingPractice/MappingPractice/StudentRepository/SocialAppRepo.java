package com.MappingPractice.MappingPractice.StudentRepository;

import com.MappingPractice.MappingPractice.Entity.SocialApps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialAppRepo extends JpaRepository<SocialApps,Integer> {
}
