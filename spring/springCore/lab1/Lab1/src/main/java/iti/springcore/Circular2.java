package iti.springcore;

import lombok.Data;

@Data
public class Circular2 {

    private Circular1 cir1;

    public Circular2(){

    }
    public Circular2( Circular1 cir1){
        this.cir1 = cir1;
    }
}
