package com.example.ManyToMany.ManyToMany.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;

    private String courseName;
    private String courseType;
    private String courseAmount;
    @ManyToMany(mappedBy = "course")
    private Set<Student> student;

    public Courses(){

    }
    public Courses(int courseId, String courseName, String courseType, String courseAmount, Set<Student> student) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseType = courseType;
        this.courseAmount = courseAmount;
        this.student = student;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseAmount() {
        return courseAmount;
    }

    public void setCourseAmount(String courseAmount) {
        this.courseAmount = courseAmount;
    }

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }
}
