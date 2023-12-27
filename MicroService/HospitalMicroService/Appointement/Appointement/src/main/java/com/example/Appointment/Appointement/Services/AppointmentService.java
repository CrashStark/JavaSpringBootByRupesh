package com.example.Appointment.Appointement.Services;

import com.example.Appointment.Appointement.Entity.Appointment;
import com.example.Appointment.Appointement.Repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepo appointmentRepo;
    public void saveAppointment(Appointment appointment){
        System.out.println("Before saving the data");
        System.out.println(appointment.toString());
        Appointment appointment1=appointmentRepo.save(appointment);
        System.out.println("after saving the data");
//        return appointment1;
    }
}
