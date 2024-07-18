package com.syq.code.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.api.R;
import com.syq.code.entity.User;
import com.syq.code.mapper.UserMapper;
import com.syq.code.service.UserService;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> FindByAll(User user) {
        User data = new User();
        data.setPassword(user.getPassword());
        data.setUsername(user.getUsername());
        data.setAge(user.getAge());
        data.setGender(user.getGender());
        data.setPhonenumber(user.getPhonenumber());
        data.setEmailaddress(user.getEmailaddress());
        return userMapper.FindByAll(data);
    }

    @Override
    public boolean Login(String username,String password) {
        if (username.isEmpty()!=true&&password.isEmpty()!=true){
            System.out.println("无缺少填写");
            if (userMapper.FindByLogin(username,password)!=null){
                System.out.println("用户输入无误，已登陆");
                return true;
            }else {
                System.out.println("用户名或密码错误");
                return false;
            }
        }
        System.out.println("用户名或密码未输入");
        return false;
    }

    @Override
    public User FindByLogin(String username,String password) {
        return userMapper.FindByLogin(username,password);
    }

    @Override
    public boolean UpdateByUsername(User user,String username_old) {
        if (username_old!=null) {
            System.out.println("用户名不为空");
            if (userMapper.FindByUsername(username_old) != null) {
                System.out.println("已找到用户");
                System.out.println(userMapper.FindByUsername(username_old).getUsername());
                userMapper.UpdateByUsername(user,username_old);
                System.out.println("用户已更改");
                return true;
            } else {
                System.out.println("没有该用户");
                return false;
            }
        }
        System.out.println("未输入用户名");
        return false;
    }

    @Override
    public User FindByUsername(String username) {
        return userMapper.FindByUsername(username);
    }

    @Override
    public boolean Cancel(String username) {
        if (username == null){
            System.out.println("用户不存在");
            return false;
        }else {
            userMapper.Cancel(username);
            System.out.println("用户资料已销毁");
            return true;
        }
    }
    @Override
    public boolean Register(User user) {
        if (user!=null){
            System.out.println("无缺少填写");
            if (userMapper.FindByUsername(user.getUsername()) == null){
                User user1 = new User();
                user1.setPassword(user.getPassword());
                user1.setUsername(user.getUsername());
                user1.setAge(user.getAge());
                user1.setGender(user.getGender());
                user1.setPhonenumber(user.getPhonenumber());
                user1.setEmailaddress(user.getEmailaddress());
                userMapper.Register(user);
                System.out.println("用户已注册好了");
                return true;
            }else {
                System.out.println("用户名已使用");
                return false;
            }
        }
        return userMapper.Register(user);
    }

}