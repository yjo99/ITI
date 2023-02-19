package iti.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import jakarta.annotation.*;

public class cont {

    private int id;


    // @custQualifier(name = "buyer" , type = PersonType.Buyer)
    // @Autowired()
    // @Qualifier("buyer")

    @Autowired
    private Person seller;
    @Autowired
    @Qualifier("buyer")
    private Person y;
    // if i write name of class it work without @qualifier


    
    public cont(int id, Person x,  Person y) {
        this.id = id;
        this.seller = x;
        this.y = y;
    }

    public cont(){

    }
    
    public cont(int id) {
        this.id = id;
    }
   
    // @Qualifier
    public cont(int id, Person buyer) {
        this.id = id;
        // this.buyer = buyer;
        this.seller = buyer;
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

    public Person getX() {
        return seller;
    }

    public void setx(Person person) {
        this.seller = person;
    }

    @PreDestroy
    public void des(){
        System.out.println("destruct");
    }

    public Person getY() {
        return y;
    }

    public void setY(Person y) {
        this.y = y;
    }
    
}
