
package iti.springcore;

import iti.interfaces.*;
import lombok.*;


@Data

public class CalculatorImp1 implements Calculator {

    private int a;
    private int b;




    public CalculatorImp1(int a , int b){
        System.out.println("int and int");

        this.a = a;
        this.b = b;
    }
    
    
    public CalculatorImp1(int a , String b){
        System.out.println("int and string = " + b );
        this.a = a;
        this.b = 6;
    }

    public CalculatorImp1(int a , float b){
        System.out.println("int and float");
        this.a = a;
        this.b = (int) b;
    }

    @Override
    public int add(){
        System.out.println("adding int number");
        return this.a + this.b;
    }

    @Override
    public int subtract() {
        System.out.println("subtract int number");
        return this.a + this.b;
    }

    @Override
    public int divid() {
        System.out.println("divid int number");
        return this.a + this.b;
    }

    @Override
    public int multi() {
        System.out.println("multi int number");
        return this.a + this.b;
    }

   
    
}
