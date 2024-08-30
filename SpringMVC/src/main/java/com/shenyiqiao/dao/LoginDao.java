package com.shenyiqiao.dao;

import com.shenyiqiao.domain.Login;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LoginDao {
    @Select("select uname,upwd from users where uname=#{uname}")
    public List<Login> Login(String uname);
    /*
    @Delete("delete from users where uname=#{uname}")
    public void delete(String uname);
    @Update("update users set uname=#{uname},upwd=#{upwd} where uname=#{uname}")
    public void update(String uname);*/

}