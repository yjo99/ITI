#include <stdio.h>
#include <conio.h>
#include <stdlib.h>


void readptr(char *ptr);
void cpy(char *ptr1, char *ptr2);




int main(){

	char *ptr1,*ptr2;
	int size,i;

	clrscr();

	printf("please enter size of you string");
	scanf("%d", &size);

	ptr1 = (char *) malloc( size * sizeof(char));
	ptr2 = (char *) malloc( size * sizeof(char));

	readptr(ptr1);

	printf("source is %s \n",ptr1);


	cpy(ptr1, ptr2);

	printf("destination is %s \n",ptr2);

	free(ptr1);
	free(ptr2);
	getch();

	return 0;

}


void readptr(char *ptr){






	printf("please Enter your name:- ");
	scanf("%s", ptr);






}

void cpy(char * ptr1, char * ptr2){

	int i=0;

	while(ptr1[i] != '\0'){

		ptr2[i] = ptr1[i];
		i++;


	}
	ptr2[i] = '\0';





}







