package com.mbinfotechworld.jwt_token_example.service;

import com.mbinfotechworld.jwt_token_example.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(),"Mahadev","mahadev@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"sada","sada@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Rupesh","rupesh@gmail.com"));

    }
    public List<User> getUsers() {
        return this.userList;
    }
}
