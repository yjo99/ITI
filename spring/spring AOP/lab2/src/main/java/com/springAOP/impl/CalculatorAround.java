package com.springAOP.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorAround {
    
    
    //pointCut
    @Pointcut("execution(* *.*.add(..))")
    public void pointCut(){}

    @org.aspectj.lang.annotation.Around("execution(* com.springAOP.impl.CalculatorImp.add(..))")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable{


        System.out.println("Before around advice by Annotation");

        Object result = pjp.proceed();

        System.out.println("After Around advice by annotation");

        return result;
    }
}
