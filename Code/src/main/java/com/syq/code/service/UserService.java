package com.syq.code.service;

import com.syq.code.entity.User;

import java.util.List;

public interface UserService {
    boolean UpdateByUsername(User user, String username_old);
    User FindByUsername(String username);
    boolean Cancel(String username);
    boolean Register(User user);
    List<User> FindByAll(User user);
    boolean Login(String username,String password);
    User FindByLogin(String username,String password);
}