package com.ah.mapper;

import com.ah.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> FindByAll(User user);
    User FindByLogin(String username, String password);
}
