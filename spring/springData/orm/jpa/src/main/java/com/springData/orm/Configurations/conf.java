package com.springData.orm.Configurations;

import com.springData.orm.DAO.WorkorderDAOImp;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import jakarta.persistence.spi.PersistenceProvider;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.springData.orm")
@PropertySource("classpath:Connection.properties")
@ImportResource("beans.xml")
public class conf {

    ///datasource var from property;
    @Value("${Connection.driver}")
    private String driver;
    @Value("${Connection.url}")
    private String url;
    @Value("${Connection.userName}")
    private String userName;
    @Value("${Connection.password}")
    private String pass;



//    hibernate persist configuration
    @Value("${hibernate.hbm2ddl.auto}")
    private String hbm2ddl;
    @Value("${hibernate.show_sql}")
    private String showSql;

    @Value("${hibernate.format_sql}")
    private String fromatSql;


    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(pass);

        return ds;
    }


    @Bean PersistenceProvider getp(){
        return new HibernatePersistenceProvider();
    }


    //local container entity manager factory bean
    @Bean
    @Qualifier("entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean getEnitiyFactory(){
        LocalContainerEntityManagerFactoryBean ent = new LocalContainerEntityManagerFactoryBean();
        ent.setDataSource(getDataSource());

        ent.setPersistenceProvider(getp());
        ent.setPackagesToScan("com.springData.orm.Entities");

        // Properties
        Properties jpaProp = new Properties();

        jpaProp.put("hibernate.hbm2ddl.auto", hbm2ddl);
        jpaProp.put("hibernate.show_sql",showSql);
        jpaProp.put("hibernate.format_sql",fromatSql);

        ent.setJpaProperties(jpaProp);

        return ent;
    }


    //dao imp
    @Bean
    public WorkorderDAOImp getWorkorderDao(EntityManagerFactory emf){
        WorkorderDAOImp workorderDao =  new WorkorderDAOImp();
        workorderDao.setEntityManager(emf);
        return workorderDao;

    }


}
