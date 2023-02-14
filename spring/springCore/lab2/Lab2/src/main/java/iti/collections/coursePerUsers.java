package iti.collections;

import iti.classes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class coursePerUsers {

    private Course course;
    private List<User> users;
    private Set<User> usersSet;


    

    public void init(){
        System.out.println("This is init method coursePerUsers");
    }

    public void des(){
        System.out.println("This is des method coursePerUsers");
    }
    
}
