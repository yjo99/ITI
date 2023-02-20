package com.springAOP.advices;

import org.springframework.aop.ThrowsAdvice;


public class AfterThrowAdv implements ThrowsAdvice {
    
    public void afterThrowing(IllegalArgumentException e){
        
            e.printStackTrace();
      
    }

}
