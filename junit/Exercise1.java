import java.util.ArrayList;


abstract class Shape{
	abstract void draw();
} 

class Circle extends Shape{
	void draw(){
		System.out.println("Draw Circle ....");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw Rectangle ....");
	}
}

class Test<T extends Shape>{
	
	void shapeList(ArrayList<T> list){
		
		for(int i=0 ; i<list.size(); i++){
			list.get(i).draw();
		}
	}
}
class Exercise1{
	public static void main(String arg[]){
		Test<Shape> t1 = new Test<Shape>();
		ArrayList<Shape> l = new ArrayList<Shape>();
		l.add(new Rectangle());
		l.add(new Circle());
		l.add(new Rectangle());
		l.add(new Rectangle());
		l.add(new Circle());
		
		t1.shapeList(l);
		
	}
}