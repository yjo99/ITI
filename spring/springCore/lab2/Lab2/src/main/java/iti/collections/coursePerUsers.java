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
    
}
