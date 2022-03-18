package modelo;



public class Password {

	private int longitud;
	private String contrasenia;
	
	public Password() {
		this.longitud = 8;

	}
	
	public Password(int longitud) {
		this.longitud = longitud;
	}
	
	public boolean esFuerte(String contrasenia) {
		
		if(contiene2Mayus(contrasenia)&& contiene1Minus(contrasenia) && contiene3Nums(contrasenia)) 
			return true;
		
		else 
			return false;
		
	}
	
	private boolean contiene2Mayus(String contrasenia) {//mas de 2 mayus
		int cont=0, i=0;
		while(cont<3 && i<contrasenia.length()) {
			if(Character.isUpperCase(contrasenia.charAt(i))) {
				cont++;
			}
			i++;
		}
		if(cont==3)
			return true;
		else
			return false;
	}
	
	private boolean contiene1Minus(String contrasenia) {//mas de 1 minus
		int cont=0, i=0;
		while(cont<2 && i<contrasenia.length()) {
			if(Character.isLowerCase(contrasenia.charAt(i))) {
				cont++;
			}
			i++;
		}
		if(cont==2)
			return true;
		else
			return false;
	}
	
	private boolean contiene3Nums(String contrasenia) {//mas de 3 numeros
		int cont=0, i=0;
		while(cont<4 && i<contrasenia.length()) {
			if(Character.isDigit(contrasenia.charAt(i))) {
				cont++;
			}
			i++;
		}
		if(cont==4)
			return true;
		else
			return false;
	}
	
	public void generarPassword() {
		this.contrasenia="";
		//agrego el alfabeto
		char[] mayus={ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'C', 'W', 'X', 'Y', 'Z' };
		char[] minus={ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] nums={ '0','1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		
		//mas de 2 mayus, mas de 1 minus, mas de 3 nums
		int random,i;
		
		
		for(i=0;i<3 && i<this.longitud;i++) {
			
			random=(int) (Math.random()*25); //genera entre 0 y 25
			this.contrasenia=this.contrasenia+mayus[random];
		}
		for(int j=0;j<2 && i<this.longitud;i++,j++) { //estos 2 siguientes for no tienen por que inicializar i de vuelta
			
			random=(int) (Math.random()*25); //genera entre 0 y 25
			this.contrasenia=this.contrasenia+minus[random];
		}
		for(int j=0;j<4 && i<this.longitud;i++,j++) {
			
			random=(int) (Math.random()*10); //genera entre 0 y 9
			this.contrasenia=this.contrasenia+nums[random];
		}
		if(i<this.longitud) {
			char[][] matriz = new char[3][];//esto lo hago para generar mas aleatoridad una vez cumplidas las condiciones minimas de seguridad
			matriz[0]=mayus;
			matriz[1]=minus;
			matriz[2]=nums;
			int random2;
			while(i<this.longitud) {
				random2=(int) (Math.random()*2); //genera entre 0 y 2
				if(random2!=2) {
					random=(int) (Math.random()*25); //genera entre 0 y 25
				}
				else {
					random=(int) (Math.random()*10); //genera entre 0 y 9
				}
				this.contrasenia=this.contrasenia+matriz[random2][random];
				i++;
			}
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return contrasenia;
	}


	
	
}















