package com.example.Doctor.DoctorModuleMS.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doctorId;
    private String doctorName;
    private Long doctorContact;

    @OneToOne(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address doctorAddress;

    @Transient
    private List<Patients> patientdata;

    public Doctor() {
    }

    public Doctor(int doctorId, String doctorName, Long doctorContact, Address doctorAddress,List<Patients> patientdata) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorContact = doctorContact;
        this.doctorAddress = doctorAddress;
        this.patientdata=patientdata;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Long getDoctorContact() {
        return doctorContact;
    }

    public void setDoctorContact(Long doctorContact) {
        this.doctorContact = doctorContact;
    }

    public Address getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(Address doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public List<Patients> getPatientdata() {
        return patientdata;
    }

    public void setPatientdata(List<Patients> patientdata) {
        this.patientdata = patientdata;
    }
}
