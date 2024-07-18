package com.syq.code.service.Impl;

import com.syq.code.entity.Euser;
import com.syq.code.entity.User;
import com.syq.code.mapper.EuserMapper;
import com.syq.code.mapper.UserMapper;
import com.syq.code.service.EuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EUserServiceImpl implements EuserService {
    @Autowired
    private EuserMapper euserMapper;

    @Override
    public List<Euser> FindByAllEuser(Euser euser) {
        Euser data = new Euser();
        data.setEusername(euser.getEusername());
        data.setEpermission(euser.getEpermission());
        return euserMapper.FindByAllEuser(data);
    }

    @Override
    public boolean UpdataByEusername(String eusername,String epermission) {
        if (eusername.isEmpty()!=true && epermission.isEmpty()!=true) {
            System.out.println("用户名不为空");
            if (euserMapper.FindByEusername(eusername) != null) {
                System.out.println("已找到用户");
                euserMapper.UpdataByEusername(eusername,epermission);
                System.out.println("用户已更改");
                return true;
            } else {
                System.out.println("没有该用户");
                return false;
            }
        }
        System.out.println("未输入用户名");
        return false;
    }
    @Override
    public Euser FindByEusername(String username) {
        return euserMapper.FindByEusername(username);
    }

}
