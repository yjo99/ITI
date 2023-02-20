package com.springAOP.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation method) throws Throwable {
        System.out.println("is around Before");

        Object result = null;

        result = method.proceed();
        
        System.out.println("is Around After");
        
        return result;
    }
    
}
