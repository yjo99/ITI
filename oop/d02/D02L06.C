#include <stdio.h>
#include <conio.h>


void main(void){

 //%%
 int size=5,i;
 int arr[5];






 clrscr();

 for(i=0; i < size; i++){
 printf("Enter the value of arr[%d] = ",i);
 scanf("%d", &arr[i]);

 }


 for(i=0; i <size; i++){

 printf("arr[%d] = %d \n", i,arr[i]);


 }






 getch();

}