import java.lang.Math;
import java.util.function.Function;
import java.util.Scanner;

class values{
	Double a;
	Double b;
	Double c;
	
	public values(){
		a=b=c=0.0;
	}
	public values(Double a, Double b, Double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
}



class qrt implements Function<values , Double[]>{
	
	public Double[] apply(values x){
		Double res[] = new Double[2];
		Double root = Math.sqrt((x.b*x.b) - (4 * x.a * x.c));
							
		res[0] = (-x.b + root ) / (2 * x.a);	
		
		res[1] = (-x.b - root) / (2 * x.a); 
		
		
		return res;
	
	}

	}







class quadratic{

	public static void main(String args[]){	
	
 	Double a,b,c;
	

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the value of a:- ");
	a = scan.nextDouble();	

	
	System.out.println("Enter the value of b:- ");
	b = scan.nextDouble();
	
	
	System.out.println("Enter the value of c:- ");
	c = scan.nextDouble();	

	values v1 = new values(a,b,c);	

	Function<values, Double[]> q1 = new qrt();
	Double result[] = q1.apply(v1);
	System.out.println("the result = "+ result[0] + "," + result[1] );
		
	}

}