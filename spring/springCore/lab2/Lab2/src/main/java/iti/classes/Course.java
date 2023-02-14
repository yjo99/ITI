package iti.classes;

import java.util.jar.Attributes.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String name;
    private int id;


    

    public void init(){
        System.out.println("This is init method Course");
    }

    public void des(){
        System.out.println("This is des method Course");
    }
}
