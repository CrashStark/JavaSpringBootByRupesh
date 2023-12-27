package com.example.Patient.PatientModuleMS.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.print.Doc;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;
    private String patientName;
    private Long contactDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")//create a column name patient_id in Address table and join patientId with Address.patient_id
    private Address address;

    @Transient
    private Doctor doctor;

    public Patient() {
    }

    public Patient(int patientId, String patientName, Long contactDetails, Address address,Doctor doctor) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.contactDetails = contactDetails;
        this.address = address;
        this.doctor=doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Long contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
