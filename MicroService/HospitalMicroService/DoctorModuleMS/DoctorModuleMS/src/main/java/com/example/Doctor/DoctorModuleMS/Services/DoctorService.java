package com.example.Doctor.DoctorModuleMS.Services;

import com.example.Doctor.DoctorModuleMS.Entity.Doctor;
import com.example.Doctor.DoctorModuleMS.ServiceRepo.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    ServiceRepo doctorService;
    public Doctor addDoctor(Doctor docter){
    Doctor savedDoctor=doctorService.save(docter);
    return savedDoctor;
    }

    public  List<Doctor> getDoctor(){
        List<Doctor> getDoctor=doctorService.findAll();
        return  getDoctor;
    }

    public void  saveDoctorDataFromPatient(Doctor doctor){
        Doctor doctor1=doctorService.save(doctor);
        System.out.println(doctor1);
        System.out.println("doctor has been Saved");
    }
}
