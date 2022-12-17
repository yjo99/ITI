#include <stdio.h>
#include <conio.h>
#include <stdlib.h>





void readptr(int *ptr, int size);
void printptr(int *ptr, int size);



int main(){

  int *ptr, size;

  clrscr();

  printf("please Enter the size of array:- ");
  scanf("%d", &size);

  ptr = (int *) malloc( size * sizeof(int));


  readptr(ptr, size);
  printptr(ptr, size);


  free(ptr);
  getch();
  return 0;

}



void readptr(int *ptr,int size){

	int i;


	for(i=0; i<size; i++){


		printf("please Enter the number:- ");
		scanf("%d", &ptr[i]);



	 }


}



void printptr(int *ptr,int size){

	int i;

	for(i=0; i<size; i++){


		printf("%d \n", *(ptr+i));



	 }


}