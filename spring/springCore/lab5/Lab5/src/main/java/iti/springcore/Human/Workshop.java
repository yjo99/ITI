package iti.springcore.Human;

import org.springframework.beans.factory.annotation.Value;

public class Workshop {

    @Value("Electricity")
    private String name;

    public Workshop() {
    }
    public Workshop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
