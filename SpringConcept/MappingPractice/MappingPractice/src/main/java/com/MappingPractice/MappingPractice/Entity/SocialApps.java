package com.MappingPractice.MappingPractice.Entity;

import jakarta.persistence.*;

@Entity
public class SocialApps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int socialId;
    private String socialAppName;
    private String socialCompany;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName ="userId")
    private User user;

    public SocialApps() {
    }

    public SocialApps(int socialId, String socialAppName, String socialCompany, User user) {
        this.socialId = socialId;
        this.socialAppName = socialAppName;
        this.socialCompany = socialCompany;
        this.user = user;
    }

    public int getSocialId() {
        return socialId;
    }

    public void setSocialId(int socialId) {
        this.socialId = socialId;
    }

    public String getSocialAppName() {
        return socialAppName;
    }

    public void setSocialAppName(String socialAppName) {
        this.socialAppName = socialAppName;
    }

    public String getSocialCompany() {
        return socialCompany;
    }

    public void setSocialCompany(String socialCompany) {
        this.socialCompany = socialCompany;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
