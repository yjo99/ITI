package com.springAOP.advices;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation method) throws Throwable {
        System.out.println("is around Before");
        System.out.println(method.getMethod().getName() + " for values " + Arrays.toString( method.getArguments()));

        Object result = null;
        String pro = "";
        if(method.getMethod().getName() == "add"){
            pro = " + ";
        }else if(method.getMethod().getName() == "multi"){
            pro = " * ";
        }else if(method.getMethod().getName() == "abst"){
            pro = " - ";
        }else {
            pro = " / ";
        }

        result = method.proceed();

        System.out.println(Array.get(method.getArguments(), 0) + " " + pro + Array.get(method.getArguments(), 1) + " = " + result);
        
        System.out.println("is Around After");
        
        return result;
    }
    
}
