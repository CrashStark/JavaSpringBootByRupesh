package com.example.Appointment.Appointement.Controller;

import com.example.Appointment.Appointement.Entity.Appointment;
import com.example.Appointment.Appointement.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping("/hello")
    public String greeting(){
        return "Hello User";
    }

    @PostMapping("/bookAppointment")
    public ResponseEntity<Void> bookAppointment(@RequestBody Appointment appointment){
        System.out.println("Appointment is called");
        appointment.setCreatedOn(LocalDate.now());
        appointment.setLocalTime(LocalTime.now());
        System.out.println(appointment.toString());
        appointmentService.saveAppointment(appointment);
        return ResponseEntity.status(200).build();
    }
}
