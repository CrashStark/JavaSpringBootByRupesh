package com.example.Appointment.Appointement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Appointment {
//in Patient Microservice we have an api called book appointment when patient book an appointment
    //then it will redirect to appointment microservice where we can save status,Bookdate and BookTime
    //and we will save it into Appointment Microservice database
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private LocalDate createdOn;
    private LocalTime localTime;
    private String status;
    private String patientName;
    private String doctorName;

    public Appointment() {
    }

    public Appointment(LocalDate createdOn, LocalTime localTime, String status,String patientName,String doctorName) {
        this.createdOn = createdOn;
        this.localTime = localTime;
        this.status = status;
        this.patientName=patientName;
        this.doctorName=doctorName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "Id=" + Id +
                ", createdOn=" + createdOn +
                ", localTime=" + localTime +
                ", status='" + status + '\'' +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
