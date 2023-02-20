package com.springAOP.advices;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterRetAdv implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnVal, Method method, Object[] args, Object targ) throws Throwable {
       System.out.println("is after Advice ");
    }
    
}
// target is object which mehtod inside of it.