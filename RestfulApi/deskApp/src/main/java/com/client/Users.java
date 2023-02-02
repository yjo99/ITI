package com.client;
import lombok.*;

import jakarta.xml.bind.annotation.XmlRootElement;


@Data
@XmlRootElement
public class Users {

    private int age;
    private String name;

    public Users(){

    }
    public Users(int age, String name){
        this.age = age;
        this.name = name;
    }
    
}
