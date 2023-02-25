package com.springData.Confugrations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.*;

import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.springData")
@PropertySource("classpath:Connection.properties")
public class conf {


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
    public DataSource mysqlDataSource() {
            
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(pass);

        return dataSource;
    }

    @Bean
    public JdbcTemplate myjdbcTemp(){
        return new JdbcTemplate(mysqlDataSource());
    }

}
