package com.oneToOne.oneToOne.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	@jakarta.persistence.Id
	@GeneratedValue
 private int Id;
 private String name;
 @OneToOne(targetEntity = Product.class, cascade = CascadeType.ALL)
 @JoinColumn(name ="Id",referencedColumnName = "pId")
 private Product product;
 public int getId() {
     return Id;
 }

 public void setId(int id) {
     this.Id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public Product getProduct() {
     return product;
 }

 public void setProduct(Product product) {
     this.product = product;
 }
}
