package iti.springcore;


import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

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


    }
}
