package com.shenyiqiao.service.Impl;

import com.shenyiqiao.controller.Code;
import com.shenyiqiao.controller.Result;
import com.shenyiqiao.dao.UserDao;
import com.shenyiqiao.domain.Regsiter;
import com.shenyiqiao.domain.User;
import com.shenyiqiao.exception.BusinessException;
import com.shenyiqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean insert(User user) {
        if (user == null) {
            throw new BusinessException(Code.business_error, "输入为空,操作错误,请重试");
        }
        try {
            userDao.insert(user);
            return true;
        } catch (RuntimeException exception) {
            throw new BusinessException(Code.business_error,"操作错误,请重试");
        }
    }

    @Override
    public boolean update(User user) {
        if (user == null) {
            throw new BusinessException(Code.business_error, "输入为空,操作错误,请重试");
        }
        try {
            userDao.update(user);
            return true;
        } catch (RuntimeException exception) {
            throw new BusinessException(Code.business_error,"操作错误，请重试");
        }
    }

    @Override
    public boolean delete(String uname) {
        if (uname == null) {
            throw new BusinessException(Code.business_error, "输入为空,操作错误,请重试");
        }
        try {
            userDao.delete(uname);
            return true;
        } catch (RuntimeException exception) {
            throw new BusinessException(Code.business_error,"操作错误，请重试");
        }
    }

    @Override
    public List<User> getAll() {
       return userDao.getAll();
    }

    @Override
    public User getAllByName(String uname) {
        if (uname == null) {
            throw new BusinessException(Code.business_error, "输入为空,操作错误,请重试");
        }
        try {
            userDao.getAllByName(uname);
            return userDao.getAllByName(uname);
        } catch (RuntimeException exception) {
            throw new BusinessException(Code.business_error,"操作错误，请重试");
        }
    }

    @Override
    public User checkName(String uname) {
        if (uname == null) {
            throw new BusinessException(Code.business_error, "输入为空,操作错误,请重试");
        }
        try {
            userDao.checkName(uname);
            return userDao.checkName(uname);
        } catch (RuntimeException exception) {
            throw new BusinessException(Code.business_error,"操作错误，请重试");
        }
    }
}
