package com.syq.code.controller;

import com.syq.code.entity.User;
import com.syq.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/FindByAll")
    public List<User> FindByAll(){
        return userService.FindByAll();
    }
}


