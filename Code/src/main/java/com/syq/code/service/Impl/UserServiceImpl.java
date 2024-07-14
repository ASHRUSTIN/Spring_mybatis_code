package com.syq.code.service.Impl;

import com.syq.code.entity.User;
import com.syq.code.mapper.UserMapper;
import com.syq.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> FindByAll(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress) {
        return userMapper.FindByAll(password,username,age,gender,phonenumber,emailaddress);
    }
    @Override
    public User FindByUsername(String username) {
        return userMapper.FindByUsername(username);
    }

    @Override
    public User Login(String username, String password) {
        return userMapper.Login(username,password);
    }
    @Override
    public boolean Register(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress) {
        if (password!=null && username!=null && age!=null && age!=null && gender!=null && phonenumber!=null && emailaddress!=null){
            System.out.println("无缺少填写");
            if (userMapper.FindByUsername(username) == null){
                User user = new User();
                user.setPassword(password);
                user.setUsername(username);
                user.setAge(age);
                user.setGender(gender);
                user.setPhonenumber(phonenumber);
                user.setEmailaddress(emailaddress);
                userMapper.Register(password,username,age,gender,phonenumber,emailaddress);
                System.out.println("用户已注册好了");
                return true;
            }else {
                System.out.println("用户名已使用");
                return false;
            }
        }
        return Register(password,username,age,gender,phonenumber,emailaddress);
    }
    @Override
    public boolean Cancel(String username) {
        if (username ==null){
            System.out.println("用户不存在");
            return false;
        }else {
            userMapper.Cancel(username);
            System.out.println("用户资料已销毁");
            return true;
        }
    }
}