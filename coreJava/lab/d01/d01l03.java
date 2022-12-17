class parmInt{
	

	public static void main(String args[]){
			
		

		if(args.length != 0){
			
			
				try{
					int x = Integer.parseInt(args[0]);
															
					if((args[1] != null)){
						for(int i = 0; i < x; i++){
							System.out.println(args[1]);
						}
					} else System.out.println("You Don`t have any String to print it");
				} catch(NumberFormatException a){ System.out.println("Is not number value");}
			
			
			
		} else System.out.println(" We Have not arguments!!!!");		

	}

}