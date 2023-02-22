package com.springAOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorAfter {

     //pointCut
     @Pointcut("execution(* com.springAOP.impl.CalculatorImp.add(..))")
     public void pointCut(){}


    @AfterReturning(pointcut ="pointCut()")
    public void AfterRet(JoinPoint jp){
            System.out.println("After advice by Annotation");
    }
    
}
