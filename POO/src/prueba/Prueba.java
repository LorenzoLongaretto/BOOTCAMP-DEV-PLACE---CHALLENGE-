package prueba;

import java.util.Scanner;

import modelo.Password;

public class Prueba {

	public static void main(String[] args) {
		String password;
		System.out.println("escriba su contrasenia");
		Scanner leer=new Scanner(System.in);
		password=leer.next();
		Password pas=new Password();//por defecto 8 de longitud
		if(pas.esFuerte(password))
			System.out.println("La contrasenia es fuerte");
		else
			System.out.println("la contrasenia no es fuerte");
		
		//por condiciones del enunciado las contraseñas para ser seguras deben tener minimo 9 de longitud
		pas.generarPassword();
		
		Password pas2=new Password(10);
		pas2.generarPassword();
		
		pas.setLongitud(12);
		pas.generarPassword();
		pas.setLongitud(1);
		pas.generarPassword();
		
	}

}
