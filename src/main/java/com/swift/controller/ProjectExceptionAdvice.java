package com.swift.controller;

import com.swift.exception.BusinessException;
import com.swift.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    public Result doException(Exception ex){
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"数据跑去外星球了;-( 请稍后再试");
    }
}
