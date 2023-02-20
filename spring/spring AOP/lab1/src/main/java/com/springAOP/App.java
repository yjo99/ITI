package com.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAOP.interfaces.Calculator;
import com.springAOP.targets.CalculatorImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("beans.xml");

        // CalculatorImp calc = appCon.getBean("calcImp", CalculatorImp.class);
        // System.out.println(calc.add(5, 3));

        // why interface not his implementation
        Calculator calcProx = appCon.getBean("calcProx", Calculator.class);
        System.out.println(calcProx.add(5, 3));
    }
}
