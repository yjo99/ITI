package iti.springcore;

import iti.annotation.*;
import iti.collections.AList;
import iti.inheritanceBean.*;
import iti.properties.User;
import iti.qualifier.*;

import java.util.*;

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


        // System.out.println("=======================================");
        // System.out.println("annotations by Prop (using reflection)");
        // System.out.println("=======================================");
        // WiredByProp wbp = (WiredByProp) fact.getBean("WiredByProp");
        // System.out.println(wbp.getCw().getText());

        
        // System.out.println("=======================================");
        // System.out.println("annotations by Setter ");
        // System.out.println("=======================================");
        // WiredBySetter wbs = (WiredBySetter) fact.getBean("WiredBySetter");
        // System.out.println(wbs.getName());
        // System.out.println(wbs.getCw().getText());
        // System.out.println(wbs.set$getCwName().getText());
       
       
       
        System.out.println("=======================================");
        System.out.println("annotations by constructor ");
        System.out.println("=======================================");
        WiredByConst wbc = (WiredByConst) fact.getBean("WiredByConstructor");
        System.out.println(wbc.getName());
        System.out.println(wbc.getCw());
        //////////////////////// Question////////////
        /// why when add required false and when create object get also error?///////
        //////////////////////////////////////////////

        System.out.println("=======================================");
        System.out.println("annotations by autowired with List ");
        System.out.println("=======================================");
        WiredList wbl = (WiredList) fact.getBean("wiredList");
        System.out.println(wbl.getName());
        Iterator<ClassWired> x = wbl.getwList().iterator();
        while(x.hasNext()){
            System.out.print(x.next().getText() + ", ");
        }



        System.out.println("=======================================");
        System.out.println("Qualifier with beans.xml");
        System.out.println("=======================================");
        cont con = (cont) fact.getBean("contQualifier");
        System.out.println(con.getId());
        System.out.println(con.getX().getName());
        System.out.println(con.getY().getName());


        System.out.println("=======================================");
        System.out.println("Recources");
        System.out.println("=======================================");
        contRes conRes = (contRes) fact.getBean("contres");
        System.out.println(conRes.getId());
        System.out.println(conRes.getBuyer().getName());


        fact.close();


    }
}
