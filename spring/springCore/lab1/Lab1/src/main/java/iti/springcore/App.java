package iti.springcore;
import iti.interfaces.*;

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
        ApplicationContext fact = new ClassPathXmlApplicationContext("beans.xml");


        ////
        System.out.println("=========================");
        System.out.println("Try using bean");
        System.out.println("=========================");
        System.out.println();
        Calculator cal1 = (Calculator) fact.getBean("calcImp1");
        cal1.add();



//        ??????????????????? void object

        System.out.println("=========================");
        System.out.println("Using static factory method by ref");
        System.out.println("=========================");
        System.out.println();

        String hq = (String) fact.getBean("HelloWorld");
        System.out.println(hq);


        /// instantiation normal factroy mehtod with another factory bean
        System.out.println();
        System.out.println("=========================");
        System.out.println("normal Factory method");
        System.out.println("=========================");
        System.out.println();
        String abbas = (String) fact.getBean("div");
        System.out.println(abbas);
        System.out.println();



        // dependency Injection test
        System.out.println();
        System.out.println("=========================");
        System.out.println("dependency Injection on constructor");
        System.out.println("=========================");
        System.out.println();
        User u1 = (User) fact.getBean("user1");
        System.out.println(u1.getCourse());
        System.out.println(u1.getName());
        System.out.println();

        System.out.println("try and user on same bean");
        User u3 = (User) fact.getBean("user1");
        System.out.println(u3.getCourse());
        System.out.println(u3.getName());
        System.out.println();


        //count of user of Bean User1
        System.out.println("=========================");
        System.out.println("Check User count of user1 Bean");
        System.out.println("=========================");
        System.out.println();

        System.out.println( " number of object on user1 bean " + u3.userCount());
        System.out.println();

        // factory mehtod injection
        System.out.println("=========================");
        System.out.println("factory mentod injection");
        System.out.println("=========================");

        System.out.println();
        String cn1 = (String) fact.getBean("courseName");
        System.out.println(cn1);
        System.out.println();

        //setter injection
        // is same of factory mehtod injection by diff usage , using propery instead of const ref
        System.out.println("=========================");
        System.out.println("Setter injection");
        System.out.println("=========================");

        User u2 = (User) fact.getBean("setterCourse");
        System.out.println(u2.getCourse());


        // circular injection
//        Error creating bean with name 'circ1': Requested bean is currently in creation:
//        Is there an unresolvable circular reference? if it both constructor
        Circular1 crc1 = (Circular1) fact.getBean("circ1");
        Circular2 crc2 = (Circular2) fact.getBean("circ2");



    }
}
