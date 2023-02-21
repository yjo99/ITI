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

        // Calculator calc = appCon.getBean("calcProx", Calculator.class);
        // System.out.println(calc.add(5, 3));

        // why interface not his implementation
        // Calculator calcProx = appCon.getBean("calcProx", Calculator.class);
        // System.out.println(calcProx.add(5, 3));

        // System.out.println(calcProx.div(5, 0));
        
        
        
        Calculator calcAutoProx = appCon.getBean("calcImp", Calculator.class);
        // System.out.println(calcAutoProx.add(5, 3));


        // System.out.println(calcAutoProx.abst(5, 6));
        try{

            System.out.println(calcAutoProx.div(5, 0));
        }catch(Exception EX){
            System.err.println("exxxxxx");
        }


    
    }
}
