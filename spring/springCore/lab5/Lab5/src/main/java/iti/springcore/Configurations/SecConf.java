package iti.springcore.Configurations;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

import iti.springcore.Human.*;

@Configuration
public class SecConf {

    @Autowired
    private BaseConf baseConf;


    @Bean
    public Workshop getWorkshop(){
        return new Workshop("Hydrolic");
    }

    @Bean
    @Scope("prototype")
    public CarParts getCarParts(){
        return new CarParts("321123pn", "123321sn", "karbratier",getWorkshop(),baseConf.getCar());
    }
    
}
