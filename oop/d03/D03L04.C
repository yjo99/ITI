#include <stdio.h>
#include <conio.h>




struct employee{
	int code;
	char name[100];
	float netSalary;

};


struct employee readStr();


int main(){

	int i;

	struct employee emps[5];

	clrscr();




		for(i=0; i<5;i++){

		printf("Enter data of employee %d \n",i+1);
		emps[i] = readStr();

		printf("employee %d \n",i+1);

		printf("-------------------\n");

		printf("employee %d { code: %d, name: %s, net Salary: %f }\n",i+1, emps[i].code,emps[i].name,emps[i].netSalary);


		}




	getch();


	return 0;


}



struct employee readStr(){

	struct employee emp;


	printf("Enter emp code: ");
	scanf("%d", &emp.code);

	printf("Enter emp name: ");
	scanf("%s", &emp.name);

	printf("Enter his net Salary: ");
	scanf("%f", &emp.netSalary);

	return emp;



}


