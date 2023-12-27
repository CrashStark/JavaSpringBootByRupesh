package com.example.Doctor.DoctorModuleMS.Controller;

import com.example.Doctor.DoctorModuleMS.Entity.Billing;
import com.example.Doctor.DoctorModuleMS.Entity.Doctor;
import com.example.Doctor.DoctorModuleMS.Services.CommunicationToPatientService;
import com.example.Doctor.DoctorModuleMS.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;
    @Autowired
    CommunicationToPatientService cmmnservice;
    @GetMapping("/hello")
    public String greetings(){
        return  "Hello Doctor";
    }

    @PostMapping("/addDoctor")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
        Doctor doctor1=doctorService.addDoctor(doctor);
        cmmnservice.senddatatopatient(doctor.getPatientdata());
        return ResponseEntity.status(200).body(doctor);
    }

    @GetMapping("/getDoctor")
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        List<Doctor> doctors=doctorService.getDoctor();
        return ResponseEntity.status(200).body(doctors);
    }

    @PostMapping("/dataFromPatient")
    public ResponseEntity<Void> dataFromPatient(@RequestBody Doctor doctor){
        doctorService.saveDoctorDataFromPatient(doctor);
        return ResponseEntity.status(200).build();
    }
    @PostMapping("/billings")
    public ResponseEntity<Void> billingsAdd(@RequestBody Billing billing){
            cmmnservice.sendBillToBillingMS(billing);
            return  ResponseEntity.status(200).build();
    }

}
