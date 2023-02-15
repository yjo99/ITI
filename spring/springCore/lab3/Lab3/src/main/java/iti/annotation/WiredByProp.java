package iti.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class WiredByProp {

    private String name;
    
    @Autowired
    private ClassWired cw;

    public WiredByProp() {
    }
    public WiredByProp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ClassWired getCw() {
        return cw;
    }
   
    
    



    
}
