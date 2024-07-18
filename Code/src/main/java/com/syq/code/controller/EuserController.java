package com.syq.code.controller;

import com.syq.code.entity.Euser;

import com.syq.code.entity.User;
import com.syq.code.service.EuserService;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EuserController {
    @Autowired
    private EuserService euserService;
    @GetMapping("/FindByAllEuser")
    public List<Euser> FindByAllEuser(Euser euser){
        return euserService.FindByAllEuser(euser);
    }
    @GetMapping("/UpdataByEusername")
    public boolean UpdataByEusername(String eusername,String epermission){
        return euserService.UpdataByEusername(eusername,epermission);
    }
    @GetMapping("/FindByEusername")
    public Euser FindByEusername(String eusername){
        return euserService.FindByEusername(eusername);
    }
}
