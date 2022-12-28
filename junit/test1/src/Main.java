import java.util.ArrayList;


abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    public double r;
    final double pi = 3.14;
    Circle(double r){
        this.r = r;
    }
    void draw(){
        System.out.println("Draw Circle ....");
    }

    public double area(){
        return pi *( r * r);
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
        l.add(new Circle(3));
        l.add(new Rectangle());
        l.add(new Rectangle());
        l.add(new Circle(3));

        t1.shapeList(l);

    }
}