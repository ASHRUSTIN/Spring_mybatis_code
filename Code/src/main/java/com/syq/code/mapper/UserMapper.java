package com.syq.code.mapper;

import com.syq.code.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.awt.*;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> FindByAll();
}