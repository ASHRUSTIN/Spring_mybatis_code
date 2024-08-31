package com.shenyiqiao.controller;


import com.shenyiqiao.domain.Regsiter;

import com.shenyiqiao.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/register")
public class RegisterController {
        @Autowired
        private RegisterService registerService;
        @PostMapping
        public Result insert(@RequestBody Regsiter regsiter) {
                Regsiter checkname = registerService.getByName(regsiter.getUname());
                if (checkname!=null){
                        boolean flag = false;
                        return new Result(flag,Code.insert_fail);
                }else{
                        boolean flag=registerService.insert(regsiter);
                        return new Result(flag,flag?Code.insert_sucessful:Code.insert_fail);
                }
        }

        @GetMapping("/{uname}")
        public Result getByName(@PathVariable String uname) {
                Regsiter regsiter = registerService.getByName(uname);
                Integer code = regsiter!=null?Code.get_sucessful:Code.get_fail;
                String msg = regsiter!=null?"查询成功":"查询失败";
                return new Result(regsiter,code,msg);
        }
}
