package com.UnitTestin.UnitTesting.Repo;

import com.UnitTestin.UnitTesting.Entities.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import  static  org.assertj.core.api.AssertionsForClassTypes.assertThat;


import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonsRepoTest {

    @Autowired
    private PersonsRepo personsRepo;
    @Test
    void isPersonExistsById() {
        Person person=new Person(123,"Ash","Tokyo");
        personsRepo.save(person);

      Boolean PersonExist=personsRepo.isPersonExistsById(person.getPersonId());
      assertThat(PersonExist).isTrue();

    }
    @AfterEach
    void tearUp(){
        personsRepo.deleteAll();
    }
    @BeforeEach
    void tearDown(){
        System.out.println("tearDown");
    }
}