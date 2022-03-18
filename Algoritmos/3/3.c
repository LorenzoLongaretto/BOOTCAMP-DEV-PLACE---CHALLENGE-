

#include <stdio.h>
#include <stdlib.h>

float calculaImporte(float valorhs,int canths,int antiguedad);

int main(){
float vhora;
char nombre[20];
int antiguedad,canths; //en anios la antiguedad
    printf("ingrese valor hora ");
    scanf("%f",&vhora);printf("\n");
    printf("ingrese nombre ");
    scanf("%s",nombre);printf("\n");
    printf("ingrese antiguedad ");
    scanf("%d",&antiguedad);printf("\n");
    printf("ingrese canitdad de horas trabajadas ");
    scanf("%d",&canths);printf("\n");
    printf("El empleado %s con antiguedad %d anios, cobra $ %f",nombre,antiguedad,calculaImporte(vhora,canths,antiguedad));
    return 0;
}

float calculaImporte(float valorhs,int canths,int antiguedad){
if(antiguedad>10)
    return valorhs*canths+antiguedad*30;
else
    return valorhs*canths;
}