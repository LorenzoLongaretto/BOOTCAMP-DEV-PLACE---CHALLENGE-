#include <stdio.h>
#include <stdlib.h>

void pidenums();

int main(){
    pidenums();
    return 0;
}

void pidenums(){
int min=9999,max=-9999,suma=0;
int num;
scanf("%d",&num);
    while (num!=-1)
    {
        if(num>max)
            max=num;
        if(num<min)
            min=num;
        suma+=num;
        scanf("%d",&num);
    }
    if(min==9999)//tambien podria preguntar por el max==-9999 o la suma==0
        printf("no se han ingresado numeros");
    else
        printf("el mayor es: %d \nel menor es: %d \nla suma es: %d",max,min,suma);
}