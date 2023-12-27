package com.MappingPractice.MappingPractice.Services;

import com.MappingPractice.MappingPractice.Entity.SocialApps;
import com.MappingPractice.MappingPractice.StudentRepository.SocialAppRepo;
import com.MappingPractice.MappingPractice.StudentRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAndSocialApp {
    @Autowired
    UserRepo userRepo;
    @Autowired
    SocialAppRepo socialApp;

    public void userAndSocialApps(com.MappingPractice.MappingPractice.Entity.User user){
        userRepo.save(user);
        System.out.println("Data Has been Saved");
    }
    public void saveSocilaApp(SocialApps socialApp1){
        socialApp.save(socialApp1);
        System.out.println("Data Has been saved");
    }


}
