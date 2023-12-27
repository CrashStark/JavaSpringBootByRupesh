package com.Feign.FeignClient1.RequestorService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "FeignClient2", url = "http://localhost:5667")
public interface FeignClient1 {
    @PostMapping("/feignClient2/{user}")
    public void callMS2(@PathVariable("user") String user);
}
