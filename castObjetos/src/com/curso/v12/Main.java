package com.curso.v12;

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
		
		Padre padre = new Nieta();
		
		Hija hija = (Hija)padre;
		
		if (hija instanceof Nieto) {
			Nieto nieto = (Nieto) hija;
			nieto.llamarClase(); //ClassCastException
		}else {
			System.out.println("No se puede hacer el Casteo");
		}
		
	}
}



