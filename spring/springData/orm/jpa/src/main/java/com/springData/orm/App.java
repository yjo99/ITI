package com.springData.orm;

import com.springData.orm.DAO.WorkorderDAOImp;
import com.springData.orm.Entites.Workorder;
import com.springData.orm.Interfaces.WorkOrderDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springData.orm.Configurations.conf;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        AnnotationConfigApplicationContext conf = new AnnotationConfigApplicationContext();
//        conf.register(conf.class);
//        conf.refresh();
//
//        WorkorderDAOImp w = (WorkorderDAOImp) conf.getBean("getWorkorderDao");

        ConfigurableApplicationContext conf = new ClassPathXmlApplicationContext("beans.xml");

        WorkOrderDAO w = (WorkOrderDAO) conf.getBean("wDAO");
        System.out.println("============ Pn ================");
        Workorder ord = w.findByTagNo("000684");
        System.out.println(ord.getName());

        ord.setName("testing sdfsfasdfasdfsdfsdf");

        w.updateWorkorder(ord);

        Workorder ord2 = w.findByTagNo("000684");
        System.out.println(ord2.getName());

        // w.entityManager.merge(ord2);
        w.deletedWorkorder(ord2);




    }
}
