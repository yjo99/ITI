package iti.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class cont {

    private int id;


    // @custQualifier(name = "buyer" , type = PersonType.Buyer)
    // @Autowired()
    // @Qualifier("buyer")
    @Qualifier("seller")
    private Person x;
    // if i write name of class it work without @qualifier

    public cont(){

    }
    
    @Autowired()
    public cont(int id, Person buyer) {
        this.id = id;
        // this.buyer = buyer;
        this.x = buyer;
    }

    @PostConstruct
    public void init(){
        System.out.println("post constructor");
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

    @PreDestroy
    public void des(){
        System.out.println("destruct");
    }
    
}
