package iti.springcore;

import iti.annotation.WiredByProp;
import iti.collections.AList;
import iti.inheritanceBean.*;
import iti.properties.User;

import org.springframework.context.*;
import org.springframework.context.support.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext fact = new ClassPathXmlApplicationContext("beans.xml");


        System.out.println("==============");
        System.out.println("Inheritance ");
        System.out.println("===============");
        B b = (B) fact.getBean("B");
        System.out.println(b.getA());
        System.out.println(b.getB());


        System.out.println("==============");
        System.out.println("Inheritance with Collections ");
        System.out.println("===============");
        AList Alist = (AList) fact.getBean("AList");
        System.out.println(Alist.getNumbers());


        System.out.println("==============");
        System.out.println("properties ");
        System.out.println("===============");
        User u1 = (User) fact.getBean("user");
        System.out.println(u1.toString());


        System.out.println("==============");
        System.out.println("annotations");
        System.out.println("===============");
        WiredByProp wbp = (WiredByProp) fact.getBean("WiredByProp");
        System.out.println(wbp.getCw().getText());



    }
}
