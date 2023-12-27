package com.MoreOnMapping.ComplexObjects.Controllers;

import com.MoreOnMapping.ComplexObjects.Entity.User;
import com.MoreOnMapping.ComplexObjects.Services.UserStuGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeControllers {
    @Autowired
    UserStuGameService userStuGameService;
    @GetMapping("hello")
    public  String greetings(){
        return "Hello User";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        System.out.println(user.toString());
        userStuGameService.addUser(user);
        System.out.println("User has been added");
        return  "User has been added to the list";
    }
}
