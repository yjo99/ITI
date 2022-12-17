import java.util.function.Function;
import java.util.Scanner;
class functionInter implements Function<Integer , Float>{
	
	public Float apply(Integer t){
		return (float)((1.8* t) + 32);
	}

}


class func{

	
	
	public static void main(String args[]){

		Function<Integer , Float> f1 = new functionInter();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Celsius:- " );
		Integer t = scan.nextInt();
		
		
		Float y = f1.apply(t);
		
		System.out.println("Celsius = " + t + " and Fahrenheit = " + y );

	}
}