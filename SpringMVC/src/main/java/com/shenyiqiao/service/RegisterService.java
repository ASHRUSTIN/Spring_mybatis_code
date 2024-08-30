package com.shenyiqiao.service;

import com.shenyiqiao.domain.Regsiter;

public interface RegisterService {
    public boolean insert(Regsiter regsiter);
    public Regsiter getByName(String uname);
}
