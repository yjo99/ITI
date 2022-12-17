#include <iostream.h>
#include <conio.h>
//////
//geoshape
class GeoShape{
	protected:
		float dim1, dim2;
	public:
		GeoShape(){ dim1 = dim2 = 0; }
		GeoShape( float x) { dim1 = dim2 = x ;}
		GeoShape( float x, float y) { dim1 = x, dim2 = y; }
		void setDim1(float x) { dim1 = x;}
		void setDim2(float x) { dim2 = x;}

		float getDim1() { return dim1;}
		float getDim2() { return dim2;}
		float calcArea() { return 0.0; }

};


class Rect: public GeoShape{
	public:
		Rect(float x, float y) : GeoShape(x,y) {}
		float calcArea() { return dim1 * dim2; }
};


class Square: public Rect {
	public:
	Square(float x) : Rect(x,x) {}

};

class Triangle : public GeoShape{
	public:
		Triangle(float b, float h): GeoShape(b,h){}
		float calcArea(){
			return 0.5 * dim1 * dim2;}


};
class Circle : public GeoShape {
	public:
		Circle(float r) : GeoShape(r) {}
		float calArea() {
			return 22/7 * dim1 * dim2; }
};


int main(){

	clrscr();


	//static binding
	Triangle myT(20, 10);
	cout << myT.calcArea() << endl;
	Circle myC(7);
	cout << myC.calcArea() << endl;
	Rect myR(2, 5);
	cout << myR.calcArea() << endl;
	Square myS(5);
	cout << myS.calcArea() << endl;



	myS.setDim2(4) ; //Violating the Square Constraint
	myC.setDim2(3)  //Violating the circle Constraint


	getch();

	return 0;

}





