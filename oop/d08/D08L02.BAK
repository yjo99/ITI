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
		~Complex();
		void setReal(float r);
		void setImag(float i);


		//// setter overloading
		void setAll();
		void setAll(float f);
		void setAll(float f, float i);


		float getReal();
		float getImag();
		Complex add(Complex & c);
		Complex sub(Complex & c);
		void print();


		// Operator overloading.

		Complex operator + (Complex &c);
		Complex operator + (float f);
		friend Complex operator + (float f, Complex & c);

		Complex operator ++ ();
		Complex operator ++ (int);

		Complex operator = (Complex & c);
		int operator == (Complex &c);

		// casting
		operator float ();

		friend istream& operator >>(istream & in, Complex& c);
		friend ostream& operator <<(ostream & out, Complex& c);




};


Complex::Complex(){

	(*this).real = imag = 0;
	//cout<< " Default Constructor is calling" << endl;
}




Complex::Complex(float r, float i){

	real = r; imag = i;
	//cout<< " Constructor with two parameter is calling" << endl;


}

Complex::Complex(float r){

	real = imag = r;
	//cout<< " Constructor with one parameter is calling" << endl;


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

	//cout << "  Destructor is calling" << endl;

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
Complex Complex::add(Complex & c){

	Complex temp;
	temp.real = real + c.real;
	temp.imag = imag + c.imag;
	return temp;

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
/////////////////////////////////////
////// operator overloading


Complex Complex::operator + (Complex & c){
	Complex temp( (*this).real + c.real, (*this).imag + c.imag);
	return temp;

}


Complex Complex::operator + (float f){
	Complex temp( (*this).real + f, imag);
	return temp;

}
//prefix

Complex Complex::operator ++ (){
	real++;
	imag++;
	return *this;

}


//postfix
Complex Complex::operator ++ (int){
	Complex temp(*this);

	real++;
	imag++;
	return temp;

}



//// assignment operators

Complex Complex::operator = (Complex & c){

	real = c.real;
	imag = c.imag;
	return *this;

}


/// comparison operators: ==

int Complex::operator == (Complex &c){
	return ( (real==c.real) && (imag == c.imag));

}

///casting

Complex::operator float() {
	return real;
}

/////shift operators
istream& operator >>(istream & in, Complex& c);
ostream& operator <<(ostream & out, Complex& c);


/////// stand alone
Complex operator + (float f, Complex &c);







int main(){


	clrscr();

	Complex c1(12,7), c2(10,-5), c3;

	cout << "c1:- ";
	c1.print();

	cout << "c2:- ";
	c2.print();

	cout << "c3:- ";
	c3.print();



	cout<< "this is adding operator" << endl;


	cout << "c3:- c1+c2 -> " << endl;

	c3 = c1 + c2;



	Complex *ptr;
	ptr = new Complex[20];
	ptr[0] = c1;
	ptr[1] = c2;
	ptr[2] = c3;

	int i;
	for(i=0; i<3; i++){
		cout << " ptr num " << i+1 << endl;
		ptr[i].print();
	}

	getch();
	return 0;


}





Complex operator + (float f, Complex & c){
	Complex temp(f + c.real, c.imag);
	return temp;


}



istream& operator >> (istream& in, Complex& c){

	cout << "enter real number. "<<endl;
    in >> c.real;

	cout << "enter imag number. "<<endl;
	in >> c.imag;

	return in;

}


ostream& operator << (ostream& out, Complex& c){

	if (c.imag < 0) out <<c.real << " - " << (-1 * c.imag) << "i" <<endl;
	else out <<c.real << " + " << ( c.imag) << "i" <<endl;


	return out;

}