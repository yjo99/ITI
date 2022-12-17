#include<iostream.h>
#include<conio.h>



class Complex{

	private:
		float real;
		float imag;

	public:
		Complex();
		Complex(float r);
		Complex(float r, float i);
		Complex(Complex &c);
		~Complex();
		void setReal(float r);
		void setImag(float i);


		//// setter overloading
		void setAll();
		void setAll(float f);
		void setAll(float f, float i);


		float getReal();
		float getImag();
		void add(Complex & c);
		Complex sub(Complex & c);
		void print();



};


Complex::Complex(){

	(*this).real = imag = 0;
	cout<< "\n Default Constructor is calling";
}




Complex::Complex(float r, float i){

	real = r; imag = i;
	cout<< "\n Constructor with two parameter is calling";


}

Complex::Complex(float r){

	real = imag = r;
	cout<< "\n Constructor with one parameter is calling";


}

Complex::Complex(Complex &c){

	this -> real = c.real;
	this -> imag = c.imag;

}

///////////////////////////////
/// setter initialization

void Complex::setAll(){
	real = imag = 0 ;

}

void Complex::setAll(float f){
	this -> real = f;
	this -> imag = f;

}
void Complex::setAll( float f, float i){
	this -> real = f;
	this -> imag = i;

}




Complex::~Complex(){

	cout << " \n Destructor is calling";

}


/////// Encapsulation

void Complex::setReal(float r){

	real = r;


}

void Complex::setImag(float i){

	imag = i;


}

/////////////////


float Complex::getReal(){
	return real;

}

float Complex::getImag(){
	return imag;

}



//////// Methods
void  Complex::add(Complex & c){

	//Complex temp;
   /*	temp.real =*/ real += c.real;
   /*	temp.imag =*/ imag += c.imag;
   //	return temp;

}


Complex Complex::sub(Complex & c){

	Complex temp;
	temp.real = real - c.real;
	temp.imag = imag - c.imag;
	return temp;

}


/////print
void Complex::print(){
 if(imag<0){
	cout << real << " - " << (-1 * imag) << "i" <<endl;

 }else {
	cout << real << " + " << ( imag) << "i" <<endl;
 }

}













int main(){


	clrscr();

	Complex comp1, comp2, comp3(5);
   //	comp1.setReal(7);
   //	comp1.setImag(2);


	comp1.setAll(7);
	comp2.setAll(2,5);

	cout<< " this is comp1 " << endl;
	comp1.print();
	comp1.add(comp2);
	comp1.print();

	cout<< " this is comp4 " << endl;
	Complex comp4(comp1);
	comp4.print();


	comp3 = comp1.sub(comp2);
	comp3.print();






	getch();
	return 0;


}