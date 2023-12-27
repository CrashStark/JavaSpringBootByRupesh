package com.ProcedureTester.ProcedureTester.Repo;

import com.ProcedureTester.ProcedureTester.Entity.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepo extends JpaRepository<ExampleEntity,Integer> {
    @Query(value = "CALL GetRecordsByAge(:p_age)", nativeQuery = true)
    List<ExampleEntity> callGetRecordsByAge(@Param("p_age") int p_age);
}
