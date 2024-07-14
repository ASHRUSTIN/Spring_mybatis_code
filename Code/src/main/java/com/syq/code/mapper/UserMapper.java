package com.syq.code.mapper;

import com.syq.code.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper{
    List<User> FindByAll(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress);
    User FindByUsername(String username);
    User Login(String username, String password);
    boolean Register(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress);
    boolean Cancel(String username);
}
