package com.ah.service;

import com.ah.entity.User;

import java.util.List;

public interface UserService {
    List<User> FindByAll(User user);
    User FindByLogin(String username, String password);
}
