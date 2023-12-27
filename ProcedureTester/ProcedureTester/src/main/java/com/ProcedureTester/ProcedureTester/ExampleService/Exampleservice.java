package com.ProcedureTester.ProcedureTester.ExampleService;

import com.ProcedureTester.ProcedureTester.Entity.ExampleEntity;
import com.ProcedureTester.ProcedureTester.Repo.ExampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Exampleservice {

    @Autowired
    ExampleRepo exampleRepo;

    public List<ExampleEntity> getRecordsByAge(int age) {
        return exampleRepo.callGetRecordsByAge(age);
    }

}
