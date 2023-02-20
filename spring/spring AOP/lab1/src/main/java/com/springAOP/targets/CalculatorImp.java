package com.springAOP.targets;

import com.springAOP.interfaces.*;

public class CalculatorImp implements Calculator {

    @Override
    public int add(int x , int y) {
        System.out.println("insdid joint point (add)");
        return x + y;
    }

    @Override
    public int multi(int x , int y) {
        return x * y;
    }

    @Override
    public int abst(int x , int y) {
       return x - y;
    }

    @Override
    public int div(int x , int y) {
        return x / y;
    }
    
}
