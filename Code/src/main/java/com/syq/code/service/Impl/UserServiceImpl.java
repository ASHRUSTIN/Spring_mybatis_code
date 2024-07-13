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
    public List<User> FindByAll() {
        return userMapper.FindByAll();
    }

}

