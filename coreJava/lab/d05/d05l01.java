import java.util.Scanner;


interface intf{

	public boolean test(String s1, String s2);

}



class StringUtils{

	public static String betterString(String s1, String s2, intf f){
		
			if(f.test(s1,s2)){
				return s1; 
			} else {return s2;}

	}

}


class test{

	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print(" Enter the value of first String :- ");
	String s1 = scan.nextLine();
	System.out.println("");
	System.out.print(" Enter the value of sec String :- ");
	String s2 = scan.nextLine();
	
	intf f = (x, y) -> x.length() > y.length();

	String test1 = StringUtils.betterString(s1,s2,f); 

	System.out.println(test1 + " is Better");		

	}


}