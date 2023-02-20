package iti.springcore.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component
public class course {


    @Value("10")
    private int idCourse;
    @Value("Mathematics")
    private String name;



    
    public course() {

        System.out.println("course const");
    }

    public course(int idCourse, String name) {
        System.out.println("course arg const");
        this.idCourse = idCourse;
        this.name = name;
    }

    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
