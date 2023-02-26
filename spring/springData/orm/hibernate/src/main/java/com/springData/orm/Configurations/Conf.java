package com.springData.orm.Configurations;


import com.springData.orm.DAO.WorkorderDAOImp;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.*;

import javax.sql.DataSource;
import org.springframework.transaction.support.TransactionTemplate;

//factory
import org.springframework.orm.hibernate5.*;

@Configuration
@ComponentScan(basePackages = "com.springData.orm")
@PropertySource("classpath:Connection.properties")
public class Conf {


    ///datasource var from property;
    @Value("${Connection.driver}")
    String driver;
    @Value("${Connection.url}")
    String url;
    @Value("${Connection.userName}")
    String userName;
    @Value("${Connection.password}")
    String pass;



    @Bean
    public DataSource getds(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(pass);
        return dataSource;
    }

    //localSessionFactoryBean
    @Bean
    public LocalSessionFactoryBean getLsfb(){
        LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
        lsfb.setDataSource(getds());
        lsfb.setPackagesToScan("com.springData.orm.Entites");

        return lsfb;
    }

    @Bean
    public HibernateTransactionManager getHTManager(){
        HibernateTransactionManager htManager = new HibernateTransactionManager();
        htManager.setSessionFactory( getLsfb().getObject());

        return htManager;
    }

    @Bean
    public HibernateTemplate getHTemplate(){
        HibernateTemplate ht = new HibernateTemplate();
        ht.setSessionFactory(getLsfb().getObject());
        return ht;
    }

    @Bean
    public WorkorderDAOImp getWorkorderDAO(){
        return new WorkorderDAOImp(getHTemplate(),getTT());
    }

    @Bean
    public TransactionTemplate getTT(){
        return new TransactionTemplate(getHTManager());
    }
}
