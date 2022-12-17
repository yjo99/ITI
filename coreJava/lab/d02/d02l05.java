import java.util.StringTokenizer; 

class countwordtoken{

	public static int countrep(String x, String word){
		
		StringTokenizer y = new StringTokenizer(x," ");
		
		int count = 0;

		while(y.hasMoreTokens()){ if (y.nextToken().equals(word)){count++;} }
		return count;
	}
	
	public static void main(String args[]){
		String x = " jo Jo jo Lo jo jo jo test";
		String word = "test";
		System.out.println( "( " + word + " ) Repeated:- " + countrep(x, word));	
	}

}