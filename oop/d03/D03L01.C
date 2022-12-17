#include <stdio.h>
#include <conio.h>




int power(int num, int pwr);


int main(){

	int num, pwr,res, i, resf=1;

	clrscr();

	printf("Enter Your base Number: ");
	scanf("%d \n", &num);

	printf("Enter Power Number: \n");
	scanf("%d \n", &pwr);


	printf(" for loop\n");

	for(i=1; i<=pwr; i++){

		resf = resf * num;


	}
	printf("base %d powr %d is (%d)\n", num, pwr, resf);


	printf(" Recursion Function\n");
	res = power(num,pwr);
	printf("base %d powr %d is (%d)", num, pwr, res);

	getch();

	return 0;

}


int power(int num, int pwr){



	if(pwr != 0) return (num * power(num, (pwr-1)));
	else	return 1;


}