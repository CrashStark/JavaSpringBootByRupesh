package com.Feign.FeignClient1.Services;

import com.Feign.FeignClient1.RequestorService.FeignClient1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignClient1Service {
    @Autowired
    FeignClient1 feignClient1;

    public String sendReqToMS2(String user){
        System.out.println("Inside SendReqToMs2");
        feignClient1.callMS2(user);
        System.out.println("User Has been sent");
        return "User has been sent";
    }
}
