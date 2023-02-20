package iti.springcore.Configurations;

import org.springframework.context.annotation.*;


import iti.springcore.study.*;




@Configuration
@ComponentScan(basePackages = "iti.springcore")
public class BaseConf {

    @Bean
    public course getCourse(){
        return new course();
    }

    @Bean
    public student getStudent(){
        return new student();
    }
    
}
