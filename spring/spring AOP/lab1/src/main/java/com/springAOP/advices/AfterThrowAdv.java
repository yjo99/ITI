package com.springAOP.advices;

import java.lang.invoke.TypeDescriptor;

import org.springframework.aop.ThrowsAdvice;


public class AfterThrowAdv implements ThrowsAdvice {
    
    public void afterThrowing(ArithmeticException e){
        System.err.println("---------------------- thorwable  -------------------------");
        try{

        }catch(ArithmeticException A){
            System.err.println("this is not divided on Zero");
        }
        
        
            
    }

}
