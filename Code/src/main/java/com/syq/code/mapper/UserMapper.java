package com.syq.code.mapper;

import com.syq.code.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper{
    boolean UpdateByUsername(User user, String username_old);
    User FindByUsername(String username);
    boolean Cancel(String username);
    boolean Register(User user);
    List<User> FindByAll(User user);
    boolean Login(String username,String password);
    User FindByLogin(String username,String password);
}