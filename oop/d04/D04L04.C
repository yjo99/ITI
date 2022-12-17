#include <stdio.h>
#include <conio.h>
#include <stdlib.h>



struct emp {
   int code;
   int netSalary;
   char name[30];
};


void scanptr(struct emp *ptr, int size);
void printptr(struct emp *ptr, int size);



int main()
{
   struct emp *ptr;
   int i, n;

   clrscr();

   printf("Enter the number of employee: ");
   scanf("%d", &n);


   ptr = (struct emp*) malloc(n * sizeof(struct emp));

   scanptr(ptr, n);
   printptr(ptr,n);

	 getch();
   return 0;
}








void scanptr(struct emp *ptr, int n){
   int i;
   printf("%d", n);

   for(i = 0; i < n; ++i)
   {
	   printf("Enter your code: ");

	   scanf("%d", &(ptr+i)->code);


	   printf("Enter your name: ");

	   scanf("%s", (ptr+i)->name);

	   printf("Enter your salary: ");

	   scanf("%d", &(ptr+i)->netSalary);
   }



}

void printptr(struct emp *ptr, int n){

   int i;

   for(i = 0; i < n; ++i){

		printf("Employee Number %d:\n", i+1);
		printf("his code: %d:\n", (ptr+i)->code);
		printf("his Name: %s:\n", (ptr+i)->name, i+1);
		printf("his Salary: %d:\n", (ptr+i)->netSalary, i+1);
   }


}