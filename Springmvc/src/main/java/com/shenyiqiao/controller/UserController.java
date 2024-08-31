package com.shenyiqiao.controller;

import com.shenyiqiao.domain.User;
import com.shenyiqiao.exception.BusinessException;
import com.shenyiqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public Result insert(@RequestBody User user) {
        if (user.equals(null)?true:false){
            throw new BusinessException(Code.business_error,"输入为空，请重新输入");
        }
        User checkname = userService.checkName(user.getUname());
        if (checkname!=null){
            throw new BusinessException(Code.business_error,"注册失败,用户名已占用,请重新输入");
        }else{
            boolean flag=userService.insert(user);
            String msg = user!=null?"注册成功":"注册失败";
            return new Result(flag,flag?Code.insert_sucessful:Code.insert_fail,msg);
        }
    }
    @PutMapping
    public Result update(@RequestBody User user) {
        User checkname = userService.checkName(user.getUname());
        if (checkname==null){
            throw new BusinessException(Code.business_error,"无该用户,请重新输入");
        }else {
            boolean flag =  userService.update(user);
            String msg = "资料更新成功";
            return new Result(flag,flag?Code.update_sucessful:Code.update_fail,msg);
        }
    }
    @DeleteMapping("/{uname}")
    public Result delete(@PathVariable String uname) {
        User checkname = userService.checkName(uname);
        if (checkname==null){
            throw new BusinessException(Code.business_error,"无该用户,请重新输入");
        }else {
            String msg = "删除用户已成功";
            boolean flag = userService.delete(uname);
            return new Result(flag,flag?Code.delete_sucessful:Code.delete_fail,msg);
        }
    }
    @GetMapping
    public Result getAll() {
        List<User> userList= userService.getAll();
        Integer code = userList!=null?Code.get_sucessful:Code.get_fail;
        String msg = userList!=null?"数据查询成功":"数据查询为空";
        return new Result(userList,code,msg);
    }
    @GetMapping("/{uname}")
    public Result getAllByName(@PathVariable String uname) {
        if (uname ==null){
            throw new BusinessException(Code.business_error,"输入为空,请重新输入");
        }else {
            User user = userService.getAllByName(uname);
            Integer code = user!=null?Code.get_sucessful:Code.get_fail;
            String msg = user!=null?"数据查询成功":"数据查询为空";
            return new Result(user,code,msg);
        }
    }
    @GetMapping("/check/{uname}")
    public Result checkName(@PathVariable String uname){
        if (uname==null){
            throw new BusinessException(Code.business_error,"输入为空,请重新输入");
        }else {
            User user = userService.checkName(uname);
            Integer code = user!=null?Code.get_sucessful:Code.get_fail;
            String msg = user!=null?"查询成功":"查询失败";
            return new Result(user,code,msg);
        }
    }
}
