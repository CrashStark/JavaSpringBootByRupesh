package com.example.BillingModule.BillingModuleMS.Repository;

import com.example.BillingModule.BillingModuleMS.Entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepo extends JpaRepository<Billing,Integer> {

}
