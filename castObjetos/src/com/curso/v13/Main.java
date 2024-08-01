package com.curso.v13;

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

class Nieta extends Hija {
	@Override
	public void llamarClase() {
		System.out.println("Llame a la clase Nieta");
	}
}

class Nieto extends Hija {
	@Override
	public void llamarClase() {
		System.out.println("Llame a la clase Nieto");
	}
}

public class Main {
	public static void main(String[] args) {
		
//		Object obj = new Nieto();
//		
//		Padre padre = (Padre)obj;
//		
//		Nieto nieto = (Nieto)padre;
//		
//		nieto.llamarClase(); 
		
		System.out.println("***********");
		
		Nieto nieto = new Nieto();
		
		Hija hija = nieto;
		
		Padre padre = hija;
		
		Object obj = padre;
		
		//obj.llamarClase();
		
	}
}



