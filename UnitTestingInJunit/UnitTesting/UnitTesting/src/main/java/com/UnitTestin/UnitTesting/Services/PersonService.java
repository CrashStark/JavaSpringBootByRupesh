package com.UnitTestin.UnitTesting.Services;

import com.UnitTestin.UnitTesting.Entities.Person;
import com.UnitTestin.UnitTesting.Repo.PersonsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonsRepo personsRepo;

    public List<Person> getAllPersons(){
        return this.personsRepo.findAll();
    }

    public PersonService(PersonsRepo personsRepo) {
        this.personsRepo = personsRepo;
    }
}
