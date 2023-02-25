package com.springAOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class CalculatorAdvices1 {

    //pointCut
    @Pointcut("execution(* com.springAOP.impl.CalculatorImp.add(..))")
    public void pointCutAdd(){}
     //pointCut
     @Pointcut("execution(* com.springAOP.impl.CalculatorImp.subt(..))")
     public void pointCutAbst(){}

     @Pointcut("execution(* com.springAOP.introduction.PersonImp.getAge(..))")
     public void PersonAge(){}

      //pointCut
    @Pointcut("pointCutAdd() || pointCutAbst() || PersonAge()")
    public void pointCut(){}

    @Before("pointCutAdd()")
    public void before(JoinPoint jp){
        System.out.println("Before advice 50000000000 by Annotation");
    }


    @org.aspectj.lang.annotation.Around("pointCut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable{


        System.out.println("Before around 1 advice by Annotation");

        Object result = pjp.proceed();

        System.out.println("After Around 5000000 advice by annotation");

        return result;
    }

    @AfterReturning(pointcut ="pointCut()", returning= "result")
    public void AfterRet(JoinPoint jp){
        System.out.println("After advice 500000 by Annotation");
    }
    
}
