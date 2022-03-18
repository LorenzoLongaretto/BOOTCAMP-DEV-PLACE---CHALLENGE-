/*Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
presione una tecla, luego de esto se cerrará el programa.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void verificaContrasenia();

int main()
{
    
    verificaContrasenia();
    return 0;
}

void verificaContrasenia()
{
    int i = 0, recuerda = 0;
    char contrasenia[20], validacion[20];
    printf("ingrese una contrasenia");
    scanf("%s", contrasenia);
    while (recuerda == 0 && i < 3)
    {
        printf("vuelva a escribir su contrasenia\n");
        scanf("%s", validacion);
        if (strcmp(contrasenia, validacion) == 0)
            recuerda = 1;
        i++;
    }
    if (recuerda == 1)
        printf("Felicitaciones,recordas tu contrasenia\n");
    else
        printf("Tenes que ejercitar la memoria");
}