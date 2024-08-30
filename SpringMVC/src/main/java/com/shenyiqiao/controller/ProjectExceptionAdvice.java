package com.shenyiqiao.controller;

import com.shenyiqiao.exception.BusinessException;
import com.shenyiqiao.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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
    public Result doException(Exception exception){
        return new Result(null,Code.sysytem_unknow_error, exception.getMessage());
    }
}
