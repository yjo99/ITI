package com.springAOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Order(0)
// @Component
public class CalculatorAdvices {



    //pointCut
    @Pointcut("execution(* *.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint jp){
        System.out.println("Before advice by Annotation");
    }


    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable{


        System.out.println("Before around advice by Annotation");

        Object result = pjp.proceed();
        System.out.println(" return value is:- " + result);
        System.out.println( "Name of Method [" + pjp.getSignature().getName() + "]");


        System.out.println("After Around advice by annotation");

        return result;
    }

    @AfterReturning(pointcut ="pointCut()", returning= "result")
    public void AfterRet(JoinPoint jp){
        System.out.println("After advice by Annotation");
    }
   
    
    
}
