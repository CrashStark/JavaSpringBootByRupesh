package com.example.Patient.PatientModuleMS.PatientRepo;

import com.example.Patient.PatientModuleMS.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Patient,Long> {
    

}
