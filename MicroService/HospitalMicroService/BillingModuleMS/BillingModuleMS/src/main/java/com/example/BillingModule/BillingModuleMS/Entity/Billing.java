package com.example.BillingModule.BillingModuleMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String services;
    private int charges;
    private String paymentStatus;
    private String billingForPatient;
    private String billingByDoctor;

    public Billing() {
    }

    public Billing( String services, int charges, String paymentStatus,String billingForPatient,
                   String billingByDoctor) {

        this.services = services;
        this.charges = charges;
        this.paymentStatus = paymentStatus;
        this.billingForPatient=billingForPatient;
        this.billingByDoctor=billingByDoctor;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getBillingForPatient() {
        return billingForPatient;
    }

    public void setBillingForPatient(String billingForPatient) {
        this.billingForPatient = billingForPatient;
    }

    public String getBillingByDoctor() {
        return billingByDoctor;
    }

    public void setBillingByDoctor(String billingByDoctor) {
        this.billingByDoctor = billingByDoctor;
    }
}
