package com.himtech.demo;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.himtech.demo.excep.BasicException;

@ControllerAdvice  
@RestController  
public class GlobalExceptionHandler {  
  
    @ResponseStatus(HttpStatus.BAD_REQUEST)  
    @ExceptionHandler(value = BasicException.class)  
    public String handleBaseException(BasicException e){  
        return e.getMessage();  
    }  
  
    @ExceptionHandler(value = Exception.class)  
    public String handleException(Exception e){return e.getMessage();}  
  
  
}  

