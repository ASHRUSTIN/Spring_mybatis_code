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
    @GetMapping("/FindByLogin")
    public User FindByLogin(String username,String password){
        return userService.FindByLogin(username,password);
    }
    @GetMapping("/Login")
    public boolean Login(String username,String password){
        return userService.Login(username,password);
    }
    @GetMapping("/FindByUsername")
    public User FindByUsername(String username){
        return userService.FindByUsername(username);
    }
    @GetMapping("/Cancel")
    public boolean Cancel(String username){
        return userService.Cancel(username);
    }
    @GetMapping("/Register")
    public boolean Register(User user){
        return userService.Register(user);
    }
    @GetMapping("/FindByAll")
    public List<User> FindByAll(User user){
        return userService.FindByAll(user);
    }
    @GetMapping("/UpdateByUsername")
    public boolean UpdateByUsername(User user,String username_old) {
        return userService.UpdateByUsername(user,username_old);
    }
}

