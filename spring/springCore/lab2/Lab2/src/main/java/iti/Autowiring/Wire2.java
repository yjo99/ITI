package iti.Autowiring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wire2 {

    private String name;
    

    

    public void init(){
        System.out.println("This is init method wire2");
    }

    public void des(){
        System.out.println("This is des method wire2");
    }
}
