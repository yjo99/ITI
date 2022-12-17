import java.util.Scanner;

class countword{

	public static int countrep(String x, String word){
		String y[] = x.split(" ");
		int count = 0;

		for(int i=0; i < y.length; i++){
			if(word.equals(y[i])) count++;

		}
		return count;
	}
	
	public static void main(String args[]){

		Scanner x = new Scanner(System.in);
		System.out.print("Enter your String :- ");
		String str = x.nextLine();
		
		System.out.print("Enter your word:- ");
		String word = x.nextLine();

		//String word = "jo";
		System.out.println( "( " + word + " ) Repeated:- " + countrep(str, word));	
	}

}