package com.example.Appointment.Appointement.Repository;

import com.example.Appointment.Appointement.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Long> {
}
