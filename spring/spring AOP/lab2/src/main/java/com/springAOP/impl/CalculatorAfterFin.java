package com.springAOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CalculatorAfterFin {

        //pointCut

    
        @After("execution(* com.springAOP.impl.CalculatorImp.add(..))")
        public void AfterFin(JoinPoint jp){
            System.out.println("After finally advice by Annotation");
        }

    
}
