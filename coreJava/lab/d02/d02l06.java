import java.util.StringTokenizer; 
import java.util.Scanner;

class address{

	public static int countrep(String x){
		
		StringTokenizer y = new StringTokenizer(x,".");
		
		int count = 0;

		while(y.hasMoreTokens()){System.out.println(y.nextToken()); }
		return count;
	}
	
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		System.out.print("Enter your ip :- ");
		String ip = x.nextLine();
		
		
		
		countrep(ip);	
	}

}