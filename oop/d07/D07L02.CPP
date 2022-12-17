#include <iostream.h>
#include <conio.h>




/////// stack example

class Stack{

	int top;
	int size;
	int *ptr;
	static int counter;


	public:
		Stack();     // default constructor
		Stack(int n); // parametraized constructor
		Stack(Stack &s); // copy constructro
		int push(int n);
		int pop( int &n );
		int isFull();
		int isEmpty();

		static int getCounter(); /////// static mehtod
		friend void viewContent(Stack &s);
		~Stack(); //destructor




};


Stack::Stack(){
	top =0;
	size = 10;
	ptr = new int[size];


	counter++;

	cout<< "this is defalut Constructor "<< endl;

}

Stack::Stack(int n){

	top = 0;
	size = n;
	ptr = new int[size];


	counter++;

	cout << "this is parametirzed Constructor" << endl;



}

Stack::~Stack(){

	delete[] ptr;
	size=0;

	counter--;

	cout << "this is destructor " << endl;

}

//copy constructro

Stack::Stack(Stack &s){
	int i;
	top = s.top;
	size = s.size;

	for(i=0; i<top; i++){
		ptr[i] = s.ptr[i];
	}
	counter++;


}


int Stack::isFull(){
	return ((top) == size);

}
int Stack::isEmpty(){

	return ((top) == 0);

}
int Stack::push(int n){

	if(isFull()) return 0;

	ptr[top] = n;
	top++;
	return 1;

}


int Stack::pop(int &num){

	if(isEmpty()) return 0;


	top--;
	num = ptr[top];

	return 1;


}

// static var, and static method
int Stack::counter =0;

int Stack::getCounter(){
	return counter;

}





// friend function

void viewContent(Stack &s);






int main(){

	clrscr();

	int num;
	Stack s1(2);
	s1.push(5);
	s1.push(15);
	s1.push(20);


	viewContent(s1);

	if(s1.pop(num)){ cout << num << endl;}
	if(s1.pop(num)){ cout << num << endl;  }


	if(s1.pop(num)){
	 cout << num << endl;
	 }else{ cout << "stack is empty" << endl;}

	 cout << "the number of Object is :- " ;
	cout <<s1.getCounter() <<endl;


	// q) when using copy cons is not counter?

	Stack s2(s1);
	cout << "the number of Object is :- " ;
	cout <<s2.getCounter() <<endl;


	getch();

	return 0;

}






void viewContent(Stack &s){

	int i;

	for(i= 0; i<s.top; i++){

		cout << "Element No " << (i+1) << " is:- " << s.ptr[i] << endl;

	}


}