#include <stdio.h>
#include <conio.h>


void main(void){

	//%%

	//lab 4 (ascending multiplication table (1-10)
	int i,j;


	clrscr();
	printf("     ");

	for (i=1; i<=10; i++){
		printf(" %3d ", i);

	}
	printf("\n");
	printf("     ");

	for (i=1; i<=10; i++){
		printf(" --- ");


	}
	printf("\n");



	//loop
	for(i=1; i<=10; i++){
		printf("%3d |", i);
		for(j=1; j<=10; j++){

		printf(" %3d ", i*j);

		}
		printf("\n");


	}


	getch();

}