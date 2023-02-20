package iti.springcore;


import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

import iti.springcore.customeScope.scopeImpl;
import iti.springcore.study.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext fact = new ClassPathXmlApplicationContext("beans.xml");

        student st1 = (student) fact.getBean("student");

        System.out.println(st1.getName());
        System.out.println(st1.getCourse().getName());




        //cust scope 
        scopeImpl imp1 = (scopeImpl) fact.getBean("scopeImpl");
        imp1.setX(0);
        System.out.println(imp1.getX());
 
        scopeImpl imp2 = (scopeImpl) fact.getBean("scopeImpl");
        imp2.setX(3);
        
        System.out.println("imp one ");
        System.out.println(imp1.getX());

        System.out.println("imp two ");
        System.out.println(imp2.getX());


    }
}
