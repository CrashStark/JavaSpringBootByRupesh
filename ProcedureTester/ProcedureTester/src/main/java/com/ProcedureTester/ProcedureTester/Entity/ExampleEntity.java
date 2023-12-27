package com.ProcedureTester.ProcedureTester.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExampleEntity {
    @Id
    private Long id;
    private String name;
    private int age;

}
