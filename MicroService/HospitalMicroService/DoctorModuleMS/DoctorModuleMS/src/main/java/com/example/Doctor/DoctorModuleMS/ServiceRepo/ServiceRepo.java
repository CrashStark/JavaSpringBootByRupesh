package com.example.Doctor.DoctorModuleMS.ServiceRepo;

import com.example.Doctor.DoctorModuleMS.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Doctor,Long> {
}
