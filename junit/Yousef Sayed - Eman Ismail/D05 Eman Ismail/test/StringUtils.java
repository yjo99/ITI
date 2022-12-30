/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emane
 */
interface intf{

	public boolean test(String s1, String s2);

}
	
class StringUtils {
    public static String betterString(String s1, String s2, intf f){
		
			if(f.test(s1,s2)){
				return s1; 
			} else {return s2;}

	}
    
     public static void main(String[] args) {
        // TODO code application logic here
	
	//Scanner scan = new Scanner(System.in);
	
	//System.out.print(" Enter the value of first String :- ");
	//String s1 = scan.nextLine();
	//System.out.println("");
	//System.out.print(" Enter the value of sec String :- ");
	//String s2 = scan.nextLine();
        
        String s1 = "wel";
        String s2 = "welcome";
	
	intf f = (x, y) -> x.length() > y.length();

	String test1 = StringUtils.betterString(s1,s2,f); 

	System.out.println(test1 + " is Better");		

	}
    
}
