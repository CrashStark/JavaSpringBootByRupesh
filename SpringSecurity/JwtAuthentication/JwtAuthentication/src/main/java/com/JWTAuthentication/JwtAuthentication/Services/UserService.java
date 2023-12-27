package com.JWTAuthentication.JwtAuthentication.Services;

import com.JWTAuthentication.JwtAuthentication.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Raj","Raj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ravina","Ravina@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Saniya","Saniya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anjali","Anjali@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
