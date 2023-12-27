package com.JWTAuthentication.JwtAuthentication.Controllers;

import com.JWTAuthentication.JwtAuthentication.Entity.User;
import com.JWTAuthentication.JwtAuthentication.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeControllers {
    @Autowired
    private UserService userService;
    //http://localhost:8081/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("Getting users");
        return this.userService.getUsers();
    }

    @GetMapping("/currentUser")
    public String getLoggenInUser(Principal principal){
    return  principal.getName();
    }
}
