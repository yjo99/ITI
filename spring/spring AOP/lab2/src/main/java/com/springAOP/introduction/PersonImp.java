package com.springAOP.introduction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springAOP.interfaces.*;



public class PersonImp implements person {

    private String name;

    private int age;

    public String getName(){
        this.name = "Yousef";
        return this.name;
    }

    public int getAge(){
        this.age = 24;
        return this.age;
    }

}
