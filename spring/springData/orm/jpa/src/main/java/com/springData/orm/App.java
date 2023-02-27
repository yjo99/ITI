package com.springData.orm;

import com.springData.orm.DAO.WorkorderDAOImp;
import com.springData.orm.Interfaces.WorkOrderDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springData.orm.Configurations.conf;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext conf = new AnnotationConfigApplicationContext();
        conf.register(conf.class);
        conf.refresh();

        WorkorderDAOImp w = (WorkorderDAOImp) conf.getBean("getWorkorderDao");
        System.out.println(w.CountWorkorderBlocked());


    }
}
