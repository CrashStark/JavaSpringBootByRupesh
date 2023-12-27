package com.MoreOnMapping.ComplexObjects.Entity;

public class User {
    private int userId;
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", rollNo=" + rollNo +
                ", student=" + student +
                ", games=" + games +
                '}';
    }

    private int rollNo;
    private Student student;
    private Games games;

    public User(int userId, String userName, int rollNo, Student student, Games games) {
        this.userId = userId;
        this.userName = userName;
        this.rollNo = rollNo;
        this.student = student;
        this.games = games;
    }

    public User(){}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }
}
