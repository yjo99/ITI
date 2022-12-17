

class RandArr{

	
	public static int[] arrFill(int arr[]){
		

		for (int i = 0; i<1000; i++){
			
			arr[i] = (int) (Math.random()*(1000));
			// System.out.println(arr[i]);
		}
		return arr;
	
	}

	public static void main(String args[]){
		int arr[] = new int[1000];

		arrFill(arr);
		int max, min;
		max = arr[0];
		min = arr[0];

		long x = System.nanoTime();
		
		for (int i=0; i<1000; i++){
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];	
		}

		

		System.out.println(" max number is " + max);
		System.out.println(" min number is " + min);


		long y = System.nanoTime();
		long z = y-x;
		System.out.println(" time to found  max and min :-  " + z);

	}

}