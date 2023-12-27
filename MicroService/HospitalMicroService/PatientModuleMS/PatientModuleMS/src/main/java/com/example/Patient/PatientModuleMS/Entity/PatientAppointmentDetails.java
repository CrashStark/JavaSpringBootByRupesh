package com.example.Patient.PatientModuleMS.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


public class PatientAppointmentDetails {

    private LocalDate createdOn;
    private LocalTime localTime;
    private String status;
    private String patientName;
    private String doctorName;

    public PatientAppointmentDetails(LocalDate createdOn, LocalTime localTime, String status, String patientName, String doctorName) {
        this.createdOn = createdOn;
        this.localTime = localTime;
        this.status = status;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
