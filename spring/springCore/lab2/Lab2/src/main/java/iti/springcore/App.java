package iti.springcore;


import iti.classes.*;
import iti.Autowiring.*;

import org.springframework.context.*;
import org.springframework.context.support.*;
import iti.collections.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext fact = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("=================");
        System.out.println("idref");
        System.out.println("=================");
        User u1 = (User) fact.getBean("User1");
        System.out.println(u1.getCourse());

        System.out.println("=================");
        System.out.println("idref with parent");
        System.out.println("=================");
        User u2 = (User) fact.getBean("User2");
        System.out.println(u2.getCourse());


        ///Collections
        System.out.println("=================");
        System.out.println(" Collections ");
        System.out.println("=================");

        //list
        coursePerUsers cpu = (coursePerUsers) fact.getBean("Users");
        
        System.out.println(cpu.getUsers());
        System.out.println("================================= ");
        //set
        coursePerUsers cpuSet = (coursePerUsers) fact.getBean("UsersSet");
        
        System.out.println(cpuSet.getUsersSet());



        ///// compunded
        System.out.println("=================");
        System.out.println(" compunded");
        System.out.println("=================");
        User usercom = (User) fact.getBean("userCom");
        System.out.println(usercom.getCourse());
        Course c1 = (Course) fact.getBean("course1");
        System.out.println(c1.getName());
        


        ///// compunded
        System.out.println();
        System.out.println("=================");
        System.out.println(" autowiring byType");
        System.out.println("=================");
        Wire1 auto = (Wire1) fact.getBean("wire1");
        System.out.println(auto.getW2());
        System.out.println(auto.getW2copy());


        System.out.println();
        System.out.println("=================");
        System.out.println(" autowiring byName");
        System.out.println("=================");
        Wire1 autoByName = (Wire1) fact.getBean("wireByName");
        System.out.println(autoByName.getW2());



        System.out.println();
        System.out.println("=================");
        System.out.println(" autowiring by Constructor");
        System.out.println("=================");
        Wire1 autoByCon = (Wire1) fact.getBean("wireByConstructor");
        System.out.println(autoByCon.getText());
        System.out.println(autoByCon.getW2());



        fact.registerShutdownHook();





    }
}
