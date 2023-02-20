package iti.springcore.beanXML.classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String idCourse;
    private Course course;
    private static int count=0;



    

    public void init(){
        System.out.println("This is init method User" + count++);
    }

    public void des(){
        System.out.println("This is des method User" + count++);
    }

    
}
