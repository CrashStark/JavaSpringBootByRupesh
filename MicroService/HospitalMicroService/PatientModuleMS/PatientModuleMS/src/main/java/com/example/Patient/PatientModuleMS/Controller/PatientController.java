package com.example.Patient.PatientModuleMS.Controller;

import com.example.Patient.PatientModuleMS.Entity.Patient;
import com.example.Patient.PatientModuleMS.Entity.PatientAppointmentDetails;
import com.example.Patient.PatientModuleMS.Services.CommunicationService;
import com.example.Patient.PatientModuleMS.Services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientServices patientService;

    @Autowired
    CommunicationService cmnservice;
    @GetMapping("/hello")
    public String greetings(){
        return "Hello User";
    }

    @PostMapping("/addAllPatient")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        Patient patientSaved=patientService.savePatient(patient);

        cmnservice.sendDatatoDoctorMS(patient.getDoctor());
        return ResponseEntity.status(200).body(patientSaved);
    }

    @GetMapping("/getAllPatient")
    public  ResponseEntity<List<Patient>>getAllPatient(){
        List<Patient> allPatient=patientService.getAllPatient();
        return  ResponseEntity.status(200).body(allPatient);
    }

    @PostMapping("/dataFromDoctor")
    public ResponseEntity<Void> dataFromDoctor(@RequestBody List<Patient> patients){
        patientService.saveAllPatient(patients);
        return ResponseEntity.status(200).build();
    }
    @PostMapping("/bookAppointment")
    public ResponseEntity<Void> bookAppointment(@RequestBody PatientAppointmentDetails appointmentDetails){
        System.out.println("Appointment Booked Called");
        appointmentDetails.setCreatedOn(LocalDate.now());
        appointmentDetails.setLocalTime(LocalTime.now());
        System.out.println("Date Set");
        cmnservice.sendAppointmentToAppointment(appointmentDetails);
        return ResponseEntity.status(200).build();
    }
}
