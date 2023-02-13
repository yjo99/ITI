package iti.springcore;

import lombok.Data;

@Data
public class Circular1 {
    private Circular2 cir2;

    public Circular1(){

    }
    public Circular1( Circular2 cir2){
        this.cir2 = cir2;
    }
}
