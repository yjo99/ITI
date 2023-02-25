package com.springAOP;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.*;

import com.springAOP.interfaces.Calculator;
import com.springAOP.interfaces.cars;
import com.springAOP.interfaces.person;
import com.springAOP.introduction.AspectImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  con = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calc = (Calculator) con.getBean("calcImp");
        // Calculator calc = (Calculator) con.getBean("calculatorImp");

        // System.out.println(calc.add(5,10));
        // System.out.println(calc.div(5,10));


        // System.out.println("============Abstract===========");
        // System.out.println(calc.subt(2,3));


        //person
        person prson = (person) calc;
        
        // System.out.println(prson.getName());
        System.out.println(prson.getAge());

        // ///
        // System.out.println("====================");
        // System.out.println("====================");
        // System.out.println("====================");
        // //cars
        // cars car = (cars) prson;
        // System.out.println(car.getCarModel());

        


        /// by conf class
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		// ctx.register(AspectImp.class);
		// ctx.refresh();

        // person 

        

    }
}
