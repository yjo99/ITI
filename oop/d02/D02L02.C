#include <stdio.h>
#include <conio.h>


void main(void){


 //%%
 //lab 2 (sum exceeds 100)

 float n=0.0, total =0.0;



  clrscr();




 while(total < 100){




	printf("Please Enter the number:- ");
	scanf("%f",&n);
	total = total + n;




 }
 printf("the number exceeds 100\n");

 printf("the total is :- %f ", total);







 getch();

}