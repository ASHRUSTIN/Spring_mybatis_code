package com.shenyiqiao.service.Impl;

import com.shenyiqiao.dao.RegsiterDao;
import com.shenyiqiao.domain.Regsiter;
import com.shenyiqiao.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegsiterDao regsiterDao;

    @Override
    public boolean insert(Regsiter regsiter) {
        regsiterDao.insert(regsiter);
        return true;
    }

    @Override
    public Regsiter getByName(String uname) {
        return regsiterDao.getByName(uname);
    }
}
