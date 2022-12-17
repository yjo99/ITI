import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class countword2{

	public static int countrep(String x, String word){
		Pattern p = Pattern.compile(word);
		Matcher m = p.matcher(x);
		
		int count = 0;

		while(m.find()){ count++;}
		return count;
	}
	
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		System.out.print("Enter your String :- ");
		String str = x.nextLine();
		
		System.out.print("Enter your word:- ");
		String word = x.nextLine();

		System.out.println( "( " + word + " ) Repeated:- " + countrep(str, word));	
	}

}