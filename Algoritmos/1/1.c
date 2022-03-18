/*Pide un número por teclado e indica si es un número primo o no. Un número primo es
aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
25 es divisible entre 5, sin embargo, 17 si es primo.*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int esprimo(int x);

int main()
{
    int num;
    printf("ingrtese un numero");
    scanf("%d", &num);
    if (esprimo(num))
        printf("El numero %d es primo", num);
    else
        printf("El numero %d no es primo", num);
    return 0;
}

int esprimo(int x)
{
    int i, raizEntera, corteCiclo = 0;
    if (x == 1 || x % 2 == 0)
    {
        if (x == 2) // caso especial, el unico primo par
            return 1;
        return 0; // no es primo
    }
    else
    {
        raizEntera = sqrt(x); //propiedad matematica para hacer menos iteraciones
        i = 2;
        while (corteCiclo == 0 && i < raizEntera)
        {
            if (x % i == 0)
                corteCiclo = 1; // no es primo
            i++;
        }
        if (corteCiclo == 0 || i >= raizEntera)
            return 1; // es primo
        else
            return 0; // no es primo
    }
}