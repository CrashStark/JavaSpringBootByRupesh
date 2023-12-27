package com.example.Patient.PatientModuleMS.Services;

import com.example.Patient.PatientModuleMS.Entity.Patient;
import com.example.Patient.PatientModuleMS.PatientRepo.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServices {
    @Autowired
    ServiceRepo servicerepository;

    public Patient savePatient(Patient patient){
        Patient savedPatient=servicerepository.save(patient);
        return  savedPatient;
    }

    public void  saveAllPatient(List<Patient> patients){
        servicerepository.saveAll(patients);
        System.out.println("GetData from Doctor");
    }
    public List<Patient> getAllPatient(){
        List<Patient> getPatient=servicerepository.findAll();
        return  getPatient;
    }
}
