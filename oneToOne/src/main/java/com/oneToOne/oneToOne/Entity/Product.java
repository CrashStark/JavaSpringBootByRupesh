package com.oneToOne.oneToOne.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
@jakarta.persistence.Id
@GeneratedValue
private int Id;
private String pname;
public int getId() {
    return Id;
}

public void setId(int id) {
    this.Id = id;
}

public String getPname() {
    return pname;
}

public void setPname(String pname) {
    this.pname = pname;
}
}
