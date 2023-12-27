package com.MappingPractice.MappingPractice.Entity;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laptopId;
    private String laptopName;
    private int laptopPrice;
    private String laptopCpu;
    @OneToOne()
    @JoinColumn(name = "student_id", referencedColumnName = "studentId")
    private Student student;
    public Laptop(){

    }

    public Laptop(int laptopId, String laptopName, int laptopPrice, String laptopCpu,Student student) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.laptopPrice = laptopPrice;
        this.laptopCpu = laptopCpu;
        this.student=student;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public String getLaptopCpu() {
        return laptopCpu;
    }

    public void setLaptopCpu(String laptopCpu) {
        this.laptopCpu = laptopCpu;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
