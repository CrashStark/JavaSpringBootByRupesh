package com.ProcedureTester.ProcedureTester.ExampleController;

import com.ProcedureTester.ProcedureTester.Entity.ExampleEntity;
import com.ProcedureTester.ProcedureTester.ExampleService.Exampleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController {

    @Autowired
    private Exampleservice exampleService;

    @GetMapping("/getByAge/{age}")
    public List<ExampleEntity> getRecordsByAge(@PathVariable int age) {
        return exampleService.getRecordsByAge(age);
    }
}
