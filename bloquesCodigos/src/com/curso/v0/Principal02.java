package com.curso.v0;

public class Principal02 {
	
	int x = 0; //VARIABLE DE INSTACIA
	
	static {
		int x = 5; //VARIABLE LOCAL
		System.out.println("Bloque static x: "+x);
	}
	
	{
		int x = 10; //VARIABLE LOCAL
		System.out.println("Bloque instancia x: "+x);

	}

	public static void main(String[] args) {
		System.out.println("Hola Bloques");
		System.out.println("Instacia Objeto x: "+new Principal02().x);
		System.out.println("***********");
		new Principal02();
		System.out.println("***********");
		new Principal02();
	}

	{ //BLOQUE INSTANCIA
		System.out.println("Ejecuta method Instancia");
	}
	
	static { //BLOQUE STATIC
		System.out.println("Ejecuta method Static");
	}
}
