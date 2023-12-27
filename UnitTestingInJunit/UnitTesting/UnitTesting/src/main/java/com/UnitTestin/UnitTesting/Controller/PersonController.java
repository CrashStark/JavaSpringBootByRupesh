package com.UnitTestin.UnitTesting.Controller;

import com.UnitTestin.UnitTesting.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllPersons(){
        return ResponseEntity.ok(this.personService.getAllPersons());
    }
}
