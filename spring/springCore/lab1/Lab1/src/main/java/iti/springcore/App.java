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
        Calculator cal1 = (Calculator) fact.getBean("calcImp1");

        cal1.add();
    }
}
