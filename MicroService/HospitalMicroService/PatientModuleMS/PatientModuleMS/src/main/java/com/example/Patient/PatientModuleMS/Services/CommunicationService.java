package com.example.Patient.PatientModuleMS.Services;

import com.example.Patient.PatientModuleMS.Entity.Doctor;
import com.example.Patient.PatientModuleMS.Entity.PatientAppointmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class CommunicationService {
    @Autowired
    RestTemplate restTemplate;

    public void sendDatatoDoctorMS(Doctor doctor) {
        //String doctorMicroserviceUrl = "http://localhost:9000/dataFromPatient";
        String doctorMicroserviceUrl = "http://localhost:9000/dataFromPatient";

        URI uri=null;
        if(doctorMicroserviceUrl!=null) {
            try {
                uri = new URI(doctorMicroserviceUrl);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("URL has Problems");
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Doctor> request = new HttpEntity<>(doctor, headers);
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(uri, request, Void.class);
        // Handle the response if needed
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println("Data sent successfully!");
        } else {
            System.out.println("Failed to send data. Status code: " + responseEntity.getStatusCodeValue());
        }

    }

    public void sendAppointmentToAppointment(PatientAppointmentDetails appointmentDetails){
        System.out.println("Inside sendAppointmentToAPPointment");
        String appointmentService="http://localhost:8000/bookAppointment";
        URI uri=null;
        if(appointmentService!=null) {
            try {
                uri = new URI(appointmentService);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("URL has Problems");
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PatientAppointmentDetails> request = new HttpEntity<>(appointmentDetails, headers);
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(uri, request, Void.class);
        // Handle the response if needed
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println("Data sent successfully!");
        } else {
            System.out.println("Failed to send data. Status code: " + responseEntity.getStatusCodeValue());
        }
    }
}
