import java.math.BigDecimal;
import java.util.Scanner;

class Complex<R extends BigDecimal, I extends BigDecimal>{

	private R r ;
	private I img ;

	Complex(R r , I img){
		
		this.r = r ;
		this.img = img ; 
	}

	void setReal(R r){
		this.r=r;
	}

	void setImaginary(I img)
	{
		this.img=img;
	}  

	R getReal(){
		return this.r;
	}

	I getImaginary(){
		return this.img;
	}
	public String printComplex(){
		return this.r + " + " + this.img + " i " ;
	}

	public Complex<R,I> add(Complex<R,I> c2){
		
		R resAddReal =(R) getReal().add(c2.getReal());
		I resAddimaginary  =(I) getImaginary().add(c2.getImaginary());
		return new Complex(resAddReal , resAddimaginary);	
	}

	public Complex<R,I> sub(Complex<R,I> c2){
		
		R resSubReal =(R) getReal().subtract(c2.getReal());
		I resSubimaginary  =(I) getImaginary().subtract(c2.getImaginary());
		return new Complex(resSubReal , resSubimaginary);	
	}

	public Complex<R,I> multiply(Complex<R,I> c2){
		
		R resMultiReal =(R) (getReal().multiply(c2.getReal())).subtract( getImaginary().multiply(c2.getImaginary()));
		I resMultiimaginary =(I) (getReal().multiply(c2.getImaginary()) ).add(getImaginary().multiply(c2.getReal()));
		return new Complex(resMultiReal , resMultiimaginary);	
	}	  
}


class test3 {

	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter data of complex.");
		System.out.println("---------------------");		
		System.out.println("Complex 1");		
		System.out.println("Real value = ");
		Integer r1 = scan.nextInt();
		System.out.println("Imaginary value = ");
		Integer i1 = scan.nextInt();
		System.out.println("---------------------");		
		System.out.println("Complex 2");		
		System.out.println("Real value = ");
		Integer r2 = scan.nextInt();
		System.out.println("Imaginary value = ");
		Integer i2 = scan.nextInt();




		Complex c1 = new Complex<BigDecimal, BigDecimal>(new BigDecimal(r1), new BigDecimal(i1));
		Complex c2 = new Complex< BigDecimal, BigDecimal> (new BigDecimal(r2), new BigDecimal(i2));

		
		System.out.println("Complex1 = " + c1.printComplex());
		System.out.println("Complex2 = " + c2.printComplex());

		System.out.println("Complex1 + Complex2 =  " + c1.add(c2).printComplex());
		System.out.println("Complex1 - Complex2 =  " + c1.sub(c2).printComplex());
		System.out.println("Complex1 * Complex2 =  " + c1.multiply(c2).printComplex());

	
	}
}