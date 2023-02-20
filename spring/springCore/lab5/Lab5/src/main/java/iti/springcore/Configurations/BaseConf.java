package iti.springcore.Configurations;

import org.springframework.context.annotation.*;


import iti.springcore.study.*;
import iti.springcore.Human.*;




@Configuration
// @ComponentScan(basePackages = "iti.springcore.study") scan it from app class
// is create your bean without creating it inside your configuration



//import(SecConf.class)
@ImportResource("classpath:/iti/springcore/beansRes.xml") 
//to imort xml file
// @Profile({"test1","test2"})
public class BaseConf {

  @Bean
  public Car getCar(){
    return new Car();
  }

  @Bean
  public Person getPerson(){
    return new Person();
  }
    
}
