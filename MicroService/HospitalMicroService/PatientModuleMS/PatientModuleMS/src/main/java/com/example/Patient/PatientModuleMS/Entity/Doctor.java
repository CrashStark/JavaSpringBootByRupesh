package com.example.Patient.PatientModuleMS.Entity;

public class Doctor {
    private String doctorName;
    private Long doctorContact;

    public Doctor() {
    }

    public Doctor(String doctorName, Long doctorContact) {
        this.doctorName = doctorName;
        this.doctorContact = doctorContact;
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
}
