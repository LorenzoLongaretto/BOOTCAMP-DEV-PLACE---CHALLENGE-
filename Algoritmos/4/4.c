#include <stdio.h>
#include <stdlib.h>

void adivinanum();

int main(){
    adivinanum();
    return 0;
}

void adivinanum(){
int num,adivina;
srand(time(0));
    num=rand() % 1000;//random entre 0 y 1000
    do{
        scanf("%d",&adivina);
        if(num>adivina)
            printf("es mayor\n");
        else
            if(num<adivina)
                printf("es menor\n");

    }while(num!=adivina);
    printf("adivinaste");
}