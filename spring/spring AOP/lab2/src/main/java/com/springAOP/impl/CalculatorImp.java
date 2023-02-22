package com.springAOP.impl;

import org.springframework.stereotype.Component;

import com.springAOP.interfaces.*;

// @Component
public class CalculatorImp implements Calculator {

    public CalculatorImp(){

    }

    @Override
    public int add(int x, int y) {
        System.out.println("joinPoint of add");
        return x + y;
    }

    @Override
    public int multi(int x, int y) {
       return x * y;
    }

    @Override
    public int subt(int x, int y) {
        return x - y;
    }

    @Override
    public int div(int x, int y) {
        return x / y;
    }
    
}
