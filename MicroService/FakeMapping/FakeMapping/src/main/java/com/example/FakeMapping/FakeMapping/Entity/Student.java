package com.example.FakeMapping.FakeMapping.Entity;


import java.util.List;

public class Student {

    private int studentID;
    private String studentName;
    private String studentLastName;
    private List<Laptop> laptop;

    public Student(){

    }
    public Student(int studentID, String studentName, String studentLastName, List<Laptop> laptop) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.laptop = laptop;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
}
