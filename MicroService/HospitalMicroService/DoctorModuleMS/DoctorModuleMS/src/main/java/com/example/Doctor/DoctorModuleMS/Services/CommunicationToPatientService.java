package com.example.Doctor.DoctorModuleMS.Services;

import com.example.Doctor.DoctorModuleMS.Entity.Billing;
import com.example.Doctor.DoctorModuleMS.Entity.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class CommunicationToPatientService {
    @Autowired
    RestTemplate restTemplate;

    public void senddatatopatient(List<Patients> patient){
//String doctorMicroserviceUrl = "http://localhost:9000/dataFromPatient";
        String doctorMicroserviceUrl = "http://localhost:8080/dataFromDoctor";

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

        HttpEntity<List<Patients>> request = new HttpEntity<>(patient, headers);
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(uri, request, Void.class);
        // Handle the response if needed
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println("Data sent successfully!");
        } else {
            System.out.println("Failed to send data. Status code: " + responseEntity.getStatusCodeValue());
        }


    }

    public void sendBillToBillingMS(Billing billing){
        String doctorMicroserviceUrl = "http://localhost:7000/addBillingsByDoctor";

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

        HttpEntity <Billing> request = new HttpEntity<>(billing, headers);
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(uri, request, Void.class);
        // Handle the response if needed
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println("Data sent successfully!");
        } else {
            System.out.println("Failed to send data. Status code: " + responseEntity.getStatusCodeValue());
        }

    }
}
