package com.springAOP.introduction;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {

    @Bean("person")
    public PersonImp getPersonImp(){
        return new PersonImp();
    }

    @Bean("car")
    public carsImp getcarsImp(){
        return new carsImp();
    }
    
    @Bean("introAspect")
    public AspectImp getAspectImp(){
        return new AspectImp();
    }
}
