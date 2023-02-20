package iti.springcore;


import java.util.*;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.*;

import iti.springcore.study.student;
import iti.springcore.Configurations.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext();
        appCon.register(BaseConf.class);
        appCon.refresh();

        //add name of method inside get bean
        student s1 = appCon.getBean("getStudent", student.class);

        System.out.println(s1.getName());
    }
}
