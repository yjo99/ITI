import java.util.*;
import java.util.Scanner;

class Test{

	
	public static void main(String args[]){
		String[] alph = { "A","B","C","D","E","f","G","H","I","J","K"};
		String[] wordTest = {"Test1", "Test8","Test3", "Test6", "Test4", "Test7"};
		Map<String, ArrayList<String>> dict = new HashMap<>();
			
		for(String a: alph){
			ArrayList<String> obj = new ArrayList<>();
	 		for (String word: wordTest){
				obj.add(String.format("%s%s", a,word));
			}
			Collections.sort(obj);
			dict.put(a,obj);
			
		}
		dict.forEach((x,y) -> System.out.println( x + ": vlaue = " + y));
		System.out.println("");

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the word.");
		String strinp = scan.nextLine();

		String s = Character.toString(strinp.charAt(0));
		
		if(Arrays.toString(alph).contains(s)){
			for(Map.Entry<String, ArrayList<String>> x : dict.entrySet()){
				if(x.getValue().contains(strinp)){
					System.out.println("this word exist in " + x.getKey());
				} 
			}
		}else {
			System.out.println("this word not in my dictionary.");
		}
			
		;
	
	
			
	
	}

}