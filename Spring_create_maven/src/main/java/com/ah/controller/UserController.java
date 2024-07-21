package com.ah.controller;

import com.ah.entity.User;
import com.ah.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userService.FindByAll(null);
        model.addAttribute("users", users);
        return "user"; // 返回users.html模板
    }
    @RequestMapping("/login")
    public String show(){
        return "login";
    }
    @RequestMapping("/fail")
    public String fail(){
        return "fail";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String username,String password) {
        if (username.isEmpty()!=true&&password.isEmpty()!=true) {
            User data = userService.FindByLogin(username, password);
            if (data != null) {
                if (data.getUsername().equals(username) && data.getPassword().equals(password)) {
                    return "success";
                }
                return "fail";
            }
            return "fail";
        }
        return "fail";
    }
}