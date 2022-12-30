import java.util.function.*;

class Enters{
    private float a;
    private float b;
    private float c;

    public Enters(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(float a){
        this.a = a;
    }
    public void setB(float b){
        this.b = b;
    }
    public void setC(float c){
        this.c = c;
    }
    public float getA(){return a;}
    public float getB(){return b;}
    public float getC(){return c;}

}

class Roots{
    private double a;
    private double b;

    public Roots(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getA(){return a;}
    public double getB(){return b;}

}

class Converter implements Function<Enters, Roots>{

    @Override
    public Roots apply(Enters ent){
        float a = ent.getA(), b = ent.getB() , c = ent.getC();
        double first = ((-1 * b) + Math.sqrt((b*b) - (4*a*c)))/(2 * a);
        double second = ((-1 * b) - Math.sqrt((b*b) - (4*a*c)))/(2 * a);
        return new Roots(first, second);
    }
}

class Example2{
    public static void main(String arg[]){
        Converter c = new Converter();
        Enters e = new Enters(1, 7, 10);
        Roots r = c.apply(e);
        System.out.println("First Root is : " + r.getA());
        System.out.println("Second Root is : " + r.getB());
    }
}