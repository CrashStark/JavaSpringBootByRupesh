package com.UnitTestin.UnitTesting.Services;

import com.UnitTestin.UnitTesting.Repo.PersonsRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    PersonsRepo personsRepo;

    private PersonService personService;
    AutoCloseable autoCloseable;

    @BeforeEach
    void setUp(){
        AutoCloseable autoCloseable1= MockitoAnnotations.openMocks(this);
        this.personService=new PersonService(this.personsRepo);
    }
    @AfterEach
    void tearDown() throws Exception {
        this.autoCloseable.close();
    }
    @Test
    void getAllPersons() {
        personService.getAllPersons();
        Mockito.verify(personsRepo.findAll());
    }
}