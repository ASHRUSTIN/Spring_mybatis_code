package com.syq.code.controller;

import com.syq.code.entity.User;
import com.syq.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/FindByAll")
    public List<User> FindByAll(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress){
        return userService.FindByAll(password,username,age,gender,phonenumber,emailaddress);
    }
    @GetMapping("/Login")
    public User Login(String username,String password){
        return userService.Login(username,password);
    }
    @GetMapping("/FindByUsername")
    public User FindByUsername(String username){
        return userService.FindByUsername(username);
    }
    @GetMapping("/Register")
    public boolean Register(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress){
        return userService.Register(password,username,age,gender,phonenumber,emailaddress);
    }
    @GetMapping("/Cancel")
    public boolean Cancel(String username){
        return userService.Cancel(username);
    }
}


