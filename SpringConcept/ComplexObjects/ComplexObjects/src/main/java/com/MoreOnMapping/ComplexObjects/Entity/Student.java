package com.MoreOnMapping.ComplexObjects.Entity;

public class Student {
    private int studentId;
    private String studentName;
    private int studentRoo;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentRoo=" + studentRoo +
                ", studentAge=" + studentAge +
                '}';
    }

    private int studentAge;

    public Student() {
    }

    public Student(int studentId, String studentName, int studentRoo, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentRoo = studentRoo;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRoo() {
        return studentRoo;
    }

    public void setStudentRoo(int studentRoo) {
        this.studentRoo = studentRoo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
