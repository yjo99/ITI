#include <stdio.h>
#include <conio.h>
#include <stdlib.h>


void scanptr(char **ptr,int size);
void printptr(char **ptr,int n);


int main(){
	char **ptr;

	int n,i,m;


	clrscr();


	printf("Enter the number of your Pointers");
	scanf("%d", &n);

	printf("Enter the size of string");
	scanf("%d", &m);


	ptr = (char **) malloc(n * sizeof(char));

	for(i=0; i<n; i++){

	  ptr[i] = (char *) malloc(m * sizeof(char));

	}


   scanptr(ptr,n);
   printptr(ptr,n);


	getch();
	return 0;
}


void scanptr(char **ptr,int n){

	int i;
	for(i=0; i < n; i++){

		printf("enter you string\n");
		scanf("%s",ptr[i]);



	}


}



void printptr(char **ptr,int n){

	int i;
	for(i=0; i < n; i++){

		printf("String Number %d : %s \n", i+1, ptr[i]);


	}


}             		