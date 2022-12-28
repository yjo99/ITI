/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author SD-Amany
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    private final int a;

    private final int b; // Three property members represent the length of three edges in a triangle, respectively
    private final int c; // Three property members represent the length of three edges in a triangle, respectively

    public Triangle(int a, int b, int c) {
        // Constructor which initializes a, b and c
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {// getter for a
        return a;
    }

    public int getB() {// getter for b
        return b;
    }

    public int getC() {// getter for c
        return c;
    }

    public boolean allPositive() {
        // Examine if all three lengths in a, b and c have a positive value
        // The method returns true if every length is positive and false otherwise
        return a > 0 && b > 0 && c > 0;
    }

    public boolean isValid() {
        // Examine if a, b and c make a valid triangle        
        // The method returns true if a, b and c make a triangle and false otherwise. 
        return this.allPositive() && (a + b) > c && (b + c) > a && (c + a) > b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // First solution 
        Triangle myTriangle2 = new Triangle(0, 4, 5);
        Triangle myTriangle3 = new Triangle(3, -4, 5);
        Triangle myTriangle4 = new Triangle(3, 1, 5);
        System.out.println( myTriangle2.allPositive());
        System.out.println( myTriangle2.isValid());
    }

}
