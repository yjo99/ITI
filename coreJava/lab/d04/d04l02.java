import java.util.*;


abstract class shape{
	 abstract public void draw();
}


class Rec extends shape{

	public void draw(){
		System.out.println("this is Rectangle draw");
	
	}	

}

class Circle extends shape{

	public void draw(){
		System.out.println("this is Circle draw");
		
	}	

}

class testShape{
	
	
	static void testsh(List<? extends shape> s){
	
		for(shape sh: s){
			
			sh.draw();
		}
	
	}

}




class test2{

	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);


		System.out.print("Enter the number of Circle:- ");
		Integer x = scan.nextInt();

		List<Circle> loc = new ArrayList<Circle>();

		for(int i=0; i<x; i++){
		
			Circle c1 = new Circle();	
			loc.add(c1);				
		
		}	



		System.out.print("Enter the number of Rectangle:- ");
		Integer y = scan.nextInt();

		List<Rec> lor = new ArrayList<Rec>();
		for(int i=0; i<y; i++){

			Rec r1 = new Rec();	
		
			lor.add(r1);					
		
		}
		testShape.testsh(loc);
		testShape.testsh(lor);
	
	}

}