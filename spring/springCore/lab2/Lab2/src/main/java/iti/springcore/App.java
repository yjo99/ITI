package iti.springcore;


import iti.classes.*;

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
        ApplicationContext fact = new ClassPathXmlApplicationContext("beans.xml");

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
        








    }
}
