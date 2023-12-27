package com.Feign.FeignClient2.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClient2Controller {

    @PostMapping("/feignClient2/{user}")
    public void getDatafromMS1(@PathVariable String user){
        System.out.println("MS2 has been hit by MS1");
        System.out.println(user);

    }
}
