package com.mbinfotechworld.jwt_token_example.controller;

import com.mbinfotechworld.jwt_token_example.model.User;
import com.mbinfotechworld.jwt_token_example.security.JwtHelper;
import com.mbinfotechworld.jwt_token_example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private AuthenticationManager manager;


    @Autowired
    private JwtHelper helper;

   @GetMapping("/")
    public String showMessage() {
        return "this is the jwt example";
    }

    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("getting users list");
        return userService.getUsers();
    }


}
