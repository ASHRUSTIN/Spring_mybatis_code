package com.shenyiqiao.dao;
import com.shenyiqiao.domain.Regsiter;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface RegsiterDao {
    @Insert("INSERT INTO users (uname,upwd,ugender,ubirthday,uaddress,uphonenumber,uemail) VALUES (#{uname},#{upwd},#{ugender},#{ubirthday},#{uaddress},#{uphonenumber},#{uemail})")
    public void insert(Regsiter regsiter);
    @Select("select uname from users where uname=#{uname}")
    public Regsiter getByName(String uname);
}
