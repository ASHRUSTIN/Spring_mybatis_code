package com.shenyiqiao.controller;

import org.springframework.beans.NullValueInNestedPathException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import com.shenyiqiao.exception.BusinessException;
import com.shenyiqiao.exception.SystemException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.EmptyStackException;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception){
        return new Result(null,exception.getCode(), exception.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception){
        return new Result(null,exception.getCode(),exception.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        // 得到请求URL地址时使用的方法
        String method = request.getMethod();
        // 定义一个返回的json对象(你们要返回什么自己来，把上面的返回值改一下就行了)
        JSONObject json = new JSONObject();
        if (e instanceof HttpRequestMethodNotSupportedException) {
            String msg = "不支持这样的"+method + "请求";
            return new Result(Code.request_method_not_support_edexception,msg);
        }else if (request.getRemoteUser() == null){
            String msg = "输入为空";
            return new Result(Code.send_null,msg);
        }else {
            return new Result(Code.sysytem_unknow_error,"系统出现未知错误");
        }
    }
}
