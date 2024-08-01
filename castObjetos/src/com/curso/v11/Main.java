package com.curso.v11;

class Padre {
	public void llamarClase() {
		System.out.println("Llame a la clase Padre");
	}
}

class Hija extends Padre {
	@Override
	public void llamarClase() {
		System.out.println("Llame a la clase Hija");
	}
}


public class Main {
	public static void main(String[] args) {
		
		Padre padre0 = new Hija();
		padre0.llamarClase();
				
		if (padre0 instanceof Hija) {
			
			Hija hija0 = (Hija) padre0; 
			hija0.llamarClase(); 
			
		}
		
		
		
		System.out.println("**********");
		
		Padre padre1 = new Padre();
		padre1.llamarClase();

		if (padre1 instanceof Hija) {
			Hija hija1 = (Hija)padre1; //ClassCastException
			hija1.llamarClase(); 
		}
		
		
		
//		Padre objetoPadre = new Padre();
//		Hija objetoHija = new Hija();
//		
//		Padre objetoHija2 = new Hija(); 
//		
//		objetoPadre.llamarClase();
//		objetoHija.llamarClase();
//		objetoHija2.llamarClase();
//		Hija objetoHija3 = (Hija)new Padre();
//		objetoHija3.llamarClase();
	}
}



