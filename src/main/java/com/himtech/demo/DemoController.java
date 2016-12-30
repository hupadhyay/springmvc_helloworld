package com.himtech.demo;

 
import org.springframework.web.bind.annotation.ExceptionHandler;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.himtech.demo.excep.BasicException;
import com.himtech.demo.excep.MyFirstException;
import com.himtech.demo.excep.MySecondException;  

@RestController  
@RequestMapping("/demo")  
public class DemoController {  
  
    @RequestMapping("/ex1")  
    public String ex1(){  
        // will be catched by global exception handler method handleBaseException  
        throw new BasicException("Basic Exception");  
    }  
  
    @RequestMapping("/ex2")  
    public String ex2(){  
        // will be catched by global exception handler method handleBaseException  
        throw new MyFirstException();  
    }  
  
    @RequestMapping("/ex3")  
    public String ex3(){  
        // will be catched by global exception handler method handleBaseException  
        throw new MySecondException();  
    }  
  
    @RequestMapping("/ex4")  
    public String ex4(){  
        // will be catched by global exception handler method handleException  
        throw new NullPointerException("null pointer exception");  
    }  
  
    @RequestMapping("/ex5")  
    public String ex5(){  
        // will be catched by controller exception hnadler handler method nfeHandler  
        throw new NumberFormatException("number format exception");  
    }  
  
    /** 
     * This method will handle all the Number Format Exceptions that arise within this controller. 
     *  
     * */  
    @ExceptionHandler(value = NumberFormatException.class)  
    public String nfeHandler(NumberFormatException e){  
        return e.getMessage();  
    }  
  
}  