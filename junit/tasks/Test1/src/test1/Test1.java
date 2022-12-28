/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

/**
 *
 * @author emane
 */
import java.util.*;

public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("please, enter a character\n");
        String x = sc.nextLine(); 
        long result = x.codePointAt(0);
        System.out.format("the asci code of %s = %d" ,x,result);
              
    }

}
