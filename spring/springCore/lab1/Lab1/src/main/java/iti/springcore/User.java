package iti.springcore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    private String name;
    private int id;
    private Course course;

    private static int count;

    public User(){
        count ++;
    }

    public User(String name, int id, Course course){
        this.name = name;
        this.id = id;
        this.course = course;

        count ++;

    }

    public String getCourseName(Course c){
        return c.getName();
    }
    public static int userCount(){
        return count;
    }
    public static void printUser(){
        System.out.println("Hello");
    }

}
