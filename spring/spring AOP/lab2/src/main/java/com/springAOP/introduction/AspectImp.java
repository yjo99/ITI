package com.springAOP.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.springAOP.interfaces.*;

@Aspect
@Component
public class AspectImp {

    @DeclareParents(defaultImpl = PersonImp.class, value="com.springAOP.impl.CalculatorImp")
    public person person;
    
    @DeclareParents(defaultImpl = carsImp.class, value="com.springAOP.impl.CalculatorImp")
    public cars car;
    
}
