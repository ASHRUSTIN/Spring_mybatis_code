package com.ah.service.impl;

import com.ah.entity.User;
import com.ah.mapper.UserMapper;
import com.ah.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    private UserMapper r;

    @Override
    public List<User> FindByAll(User user) {
        return userMapper.FindByAll(user);
    }


    @Override
    public User FindByLogin(String username, String password) {
        return userMapper.FindByLogin(username,password);
    }

}

