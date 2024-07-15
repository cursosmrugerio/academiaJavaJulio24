package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {

		int x = 5;
		String cadena = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		
		actualiza(x,cadena,sb); //COPIA DE LA VARIABLE DE REFERENCIA
		
		System.out.println("x: "+x); //5
		System.out.println("cadena: "+cadena); //Hello
		System.out.println("sb: "+sb); //Hola Mundo

		
	}
	
	static void actualiza(int x, String cadena, StringBuilder sb) {
		x = x + 5;
		cadena = cadena.concat(" World");
		sb = sb.append(" Mundo");
		
	}

}
