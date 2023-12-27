package com.MappingPractice.MappingPractice.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String userGender;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SocialApps> userSocialApps;

    public User(){}
    public User(int userId, String userName, String userGender, List<SocialApps> userSocialApps) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userSocialApps = userSocialApps;
    }

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

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public List<SocialApps> getUserSocialApps() {
        return userSocialApps;
    }

    public void setUserSocialApps(List<SocialApps> userSocialApps) {
        this.userSocialApps = userSocialApps;
    }
}
