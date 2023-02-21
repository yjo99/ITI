package com.springAOP.advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdv implements MethodBeforeAdvice{

    @Override
    public void before(Method mehtod, Object[] args, Object targ) throws Throwable {
        System.out.println("before advice");
        // System.out.println("name of join Point = " + mehtod.getName());
        // System.out.println("target is " + targ);
        
    }
    
}
