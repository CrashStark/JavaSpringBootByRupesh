package com.Feign.FeignClient1.Controller;

import com.Feign.FeignClient1.Services.FeignClient1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeignClient1Controller {
    @Autowired
    FeignClient1Service feignClient1Service;

    @GetMapping("/hello")
    public String greetings(){
        return "Hello User";
    }

    @PostMapping("/resourceMs1/{user}")
    public String RequestMs2(@PathVariable String user){
        System.out.println(user);
        feignClient1Service.sendReqToMS2(user);
        return "request has been send";

    }
}
