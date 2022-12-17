import java.lang.Exception;
import java.util.Scanner;

class myError extends Exception{
	
	myError(String s){
		super(s);
	}

}


class handlerNumber{
	
	
	Integer x;
	handlerNumber(){x=0;}
	handlerNumber(Integer x){this.x = x;}

	public Boolean check() throws myError {
		if(x<100){ return true ;}
		else { throw new myError("is greater than 100 ");}
		
	}
}


class test{
	
	public static void main(String args[]){

		System.out.print(" Enter number less than 100:- ");		
		Scanner scan = new Scanner(System.in);
		Integer x = scan.nextInt();

		handlerNumber h1 = new handlerNumber(x);
		try{
			System.out.println(h1.check());
		}catch(myError e){
			e.printStackTrace();
		}
	}

}
		

