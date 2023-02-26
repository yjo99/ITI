package com.springData.orm;

import com.springData.orm.Entites.Workorder;
import com.springData.orm.Interfaces.WorkOrderDAO;
import org.hibernate.jdbc.Work;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springData.orm.Configurations.Conf;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import javax.sql.DataSource;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext conf = new AnnotationConfigApplicationContext();
        conf.register(Conf.class);
        conf.refresh();


        WorkOrderDAO w1 = (WorkOrderDAO) conf.getBean("getWorkorderDAO");
//        Workorder workorder = w1.findByTagNo("000737");
//        System.out.println("pn = "+ workorder.getPn());

        System.out.println();
        System.out.println();
        System.out.println("============ count ===================");

        System.out.println(w1.CountWorkorderBlocked());

        System.out.println();
        System.out.println();
        System.out.println("============ get all workorders  ===================");
        List<Workorder> workorders = w1.findAllWorkorder();
        for(Workorder w :workorders){
            if(w.getPn().equals("123B10045-501")){
                w.setName("Test updated");
                w1.updateWorkorder(w);
            }
            System.out.println("Workorder , pn = " + w.getPn() + " name = " + w.getName());
        }


    }
}
