package com.shenyiqiao.dao;

import com.shenyiqiao.domain.Regsiter;
import com.shenyiqiao.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface UserDao {
    @Select("select * from users")
    public List<User> getAll();
    @Select("select * from users where uname=#{uname}")
    public User getAllByName(String uname);
    @Update("update users set uname=#{uname},upwd=#{upwd},ugender=#{ugender},ubirthday=#{ubirthday},uaddress=#{uaddress},uphonenumber=#{uphonenumber},uemail=#{uemail} where uname=#{uname}")
    public void update(User user);
    @Delete("delete from users where uname=#{uname}")
    public void delete(String uname);
    @Insert("INSERT INTO users (uname,upwd,ugender,ubirthday,uaddress,uphonenumber,uemail) VALUES (#{uname},#{upwd},#{ugender},#{ubirthday},#{uaddress},#{uphonenumber},#{uemail})")
    public void insert( User user);
    @Select("select uname from users where uname = #{uname}")
    public User checkName(String uname);
}

