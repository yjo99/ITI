package iti.springcore.study;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import jakarta.inject.*;
import org.springframework.beans.factory.annotation.*;

@Service
public class student {
    @Value("Yousef Sayed Abdelaziz")
    private String name;

    private course course;

    
    public student() {
        System.out.println("strudent const");
    }

    @Autowired
    public student(  String name, course course) {
        System.out.println("student args const");
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public course getCourse() {
        return course;
    }

    public void setCourse(course course) {
        System.out.println("set course from student");
        this.course = course;
    }
    
}
