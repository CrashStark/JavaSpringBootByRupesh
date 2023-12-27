package com.example.BillingModule.BillingModuleMS.Controllers;

import com.example.BillingModule.BillingModuleMS.Entity.Billing;
import com.example.BillingModule.BillingModuleMS.Services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingControllers {
    @Autowired
    BillingService billingService;
    @GetMapping("/hello")
    public String greetings(){
        return "Hello";
    }

    @PostMapping("/addBillingsByDoctor")
    public ResponseEntity<Billing> addBilling(@RequestBody Billing billing){
        Billing billing1=billingService.saveBillingDetails(billing);
        return ResponseEntity.status(200).body(billing1);
    }
}
