/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search;

/**
 *
 * @author emane
 */
public class Search {

    private static String a;
    private static String b;

    public Search(String a , String b) {
        this.a= a ;
        this.b =b ;
        
    }
    

    public static int searchWord(String a, String b) {
       

        if (a.contains(b)) {
            return 1 + searchWord(a.replaceFirst(b, ""), b);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String str = " welcome to java track , welcome again";
        String search = "welcome";
        System.out.println(" Number of repeating : " + searchWord(str, search));
    }

}
