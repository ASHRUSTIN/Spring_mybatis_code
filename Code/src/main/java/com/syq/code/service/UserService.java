package com.syq.code.service;

import com.syq.code.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.xml.transform.Result;
import java.util.List;

public interface UserService {
    List<User> FindByAll(String password, String username, Integer age, Integer gender, String phonenumber, String emailaddress);
    User FindByUsername(String username);
    User Login(String username,String password);
    boolean Register(String password, String username, Integer age, Integer gender, String f_phonenumber, String emailaddress);
    boolean Cancel(String username);
}