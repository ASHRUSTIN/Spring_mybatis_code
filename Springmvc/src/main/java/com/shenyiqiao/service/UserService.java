package com.shenyiqiao.service;

import com.shenyiqiao.domain.Regsiter;
import com.shenyiqiao.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public boolean insert(User user);

    public boolean update(User user);

    public boolean delete(String uname);

    public List<User> getAll();

    public User getAllByName(String uname);

    public User checkName(String uname);

}
