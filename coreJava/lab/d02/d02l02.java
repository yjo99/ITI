import java.util.Arrays;
import java.util.Scanner;


class bs{

	
	public static int[] arrFill(int arr[]){
		

		for (int i = 0; i<1000; i++){
			
			arr[i] = (int) (Math.random()*(1000));
			// System.out.println(arr[i]);
		}
		return arr;
	
	}

	public static int binarySearch(int arr[] , int low, int high, int k){
		
		
		
	if( low < high){		 

		int mid = ((low + high) / 2); 
		
		
		if (arr[mid] > k){
			return binarySearch(arr, low, (mid-1), k);
		} if (arr[mid] < k){
			return binarySearch(arr,(mid+1), high, k);
		}
		return mid;

 	} else{
		
		return -1;
	}
		

		
	}


	public static void main(String args[]){
		int arr[] = new int[1000];

		arrFill(arr);
		Arrays.sort(arr);
		
		int max = arr[(arr.length - 1)];
		int min = arr[0];
		
		
		System.out.println(" max number is " + max);
		System.out.println(" min number is " + min );
		
	
		Scanner scan = new Scanner(System.in);

		
		boolean b = true;
		int k=0;
		while(b){
	
		System.out.print("Enter number :- ");
		k = scan.nextInt();
		if (0<=k || k<=1000){
			b = false;
		} else{ 
			b = true;}
		
		}
		
		long x = System.nanoTime();
		String t;
		int resmin = binarySearch(arr, 0, arr.length, k);
		if(resmin != -1) { t = Integer.toString(resmin);}
		else { t = "not Exist";}
 		System.out.println("your index of your value in array is :- " + t);

		long y = System.nanoTime();
		long z = y-x;
		System.out.println(" time to found  search :-  " + z);

	}

}