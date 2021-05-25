package com.exception;

import com.alibaba.fastjson.JSONObject;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;

/**
 * @author zouwenhai
 * @version v1.0.0
 * @Package : com.exception
 * @Description 全局运行时异常
 * @Create on : 2021/1/12 14:13
 **/
@ControllerAdvice
public class GlobalException extends RuntimeException {


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public String exceptionHandler(MethodArgumentNotValidException ex) {
        System.out.println(ex.getBindingResult().getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
        return null;
    }

}
