package com.springAOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorAfterTrhow {

      //pointCut
      @Pointcut("execution(* com.springAOP.impl.CalculatorImp.add(..))")
      public void pointCut(){}
  
      @AfterThrowing("pointCut()")
      public void AfterThrow(JoinPoint jp, Exception ex){
          System.out.println("After Throw advice by Annotation");
      }
    
}
