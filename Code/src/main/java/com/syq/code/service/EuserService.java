package com.syq.code.service;

import com.syq.code.entity.Euser;
import com.syq.code.entity.User;

import java.util.List;

public interface EuserService {
    List<Euser> FindByAllEuser(Euser euser);
    boolean UpdataByEusername(String eusername,String epermission);
    Euser FindByEusername(String username);
}
