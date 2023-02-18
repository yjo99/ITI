package iti.qualifier;
import org.springframework.beans.factory.annotation.*;


import jakarta.annotation.Resource;

public class contRes {


    private int id;

    @Resource(name = "buyer")
    private Person x;

    public contRes(){

    }
    public contRes(int id, Person buyer) {
        this.id = id;
        this.x = buyer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getBuyer() {
        return x;
    }

    public void setBuyer(Person buyer) {
        this.x = buyer;
    }
    
}

    

