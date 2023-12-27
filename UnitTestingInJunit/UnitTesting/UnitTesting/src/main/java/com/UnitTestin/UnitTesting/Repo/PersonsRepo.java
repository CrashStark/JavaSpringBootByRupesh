package com.UnitTestin.UnitTesting.Repo;

import com.UnitTestin.UnitTesting.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepo extends JpaRepository<Person,Integer> {

    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personID = ?1")
    Boolean isPersonExistsById(Integer id);

}
