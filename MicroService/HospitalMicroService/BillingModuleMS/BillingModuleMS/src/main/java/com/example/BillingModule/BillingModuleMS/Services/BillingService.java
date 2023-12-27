package com.example.BillingModule.BillingModuleMS.Services;

import com.example.BillingModule.BillingModuleMS.Entity.Billing;
import com.example.BillingModule.BillingModuleMS.Repository.BillingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    @Autowired
    BillingRepo billingRepo;

    public Billing saveBillingDetails(Billing billing){
        Billing billing1=billingRepo.save(billing);
        System.out.println("Billing Saved");
        return billing;
    }
}
