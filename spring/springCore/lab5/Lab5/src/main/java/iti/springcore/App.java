package iti.springcore;


import java.util.*;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.*;

import iti.springcore.study.student;
import iti.springcore.Configurations.*;
import iti.springcore.Human.*;
import iti.springcore.beanXML.classes.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext();
        
        appCon.getEnvironment().setActiveProfiles("test1");
        appCon.register(BaseConf.class);
        appCon.register(SecConf.class);
        appCon.scan("iti.springcore.study");

        appCon.refresh();



        //add name of method inside get bean
        //trying componentScan
        student s1 = appCon.getBean("student", student.class);

        System.out.println(s1.getName());



        //Human with //bean in configuration file
        Person p1 = appCon.getBean("getPerson", Person.class);
        System.out.println(p1.getCar().getCarModel());


        ///autowired
        CarParts carPart1 = appCon.getBean("getCarParts", CarParts.class);
        System.out.println(carPart1.getName() + "{ Workshop =" + carPart1.getWorkshop().getName()+ " , carModel = " + carPart1.getCar().getCarModel()  +"} and obj number " + carPart1.getObjCount());

        CarParts carPart2 = appCon.getBean("getCarParts", CarParts.class);
        System.out.println(carPart2.getName() + "{ Workshop =" + carPart2.getWorkshop().getName()+ " , carModel = " + carPart2.getCar().getCarModel()  +"} and obj number " + carPart2.getObjCount());



        //trying importResource
        User user1 = appCon.getBean("User2",User.class);
        System.out.println(user1.getName() + " course =[ " + user1.getCourse().getName() + "]" );


    }
}
