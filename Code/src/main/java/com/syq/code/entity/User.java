package com.syq.code.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("t_user")//当实体类和表名不一致的时候，用@tablename来指定表名
public class User {
    @TableField(exist = false)
    private Integer id;
    private String password;
    private String username;
    private Integer age;
    private Integer gender;
    private String phonenumber;
    private String emailaddress;
}

