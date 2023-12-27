package com.MoreOnMapping.ComplexObjects.Services;

import com.MoreOnMapping.ComplexObjects.Entity.Games;
import com.MoreOnMapping.ComplexObjects.Entity.Student;
import com.MoreOnMapping.ComplexObjects.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserStuGameService {

    List<User> userList=new ArrayList<User>();

    public User addUser(User user){
        userList.add(user);
        System.out.println(userList.toString());
      return null;
    }
}
