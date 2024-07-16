package com.curso.v0;

public class Principal4 {

	public static void main(String[] args) {

		int x = 5;
		String cadena = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		
		cadena = actualiza(x,cadena,sb); //COPIA DE LA VARIABLE DE REFERENCIA
		
		System.out.println("x: "+x); //5
		System.out.println("cadena: "+cadena); //Hello World
		System.out.println("sb: "+sb); //Hola Mundo

	}
	
	static String actualiza(int x, String cadena, StringBuilder sb) {
		x = x + 5;
		sb.append(" Mundo");
		cadena =  cadena.concat(" World");
	
		System.out.println("x: "+x); //10
		System.out.println("cadena: "+cadena); //Hello World
		System.out.println("sb: "+sb); //Hola Mundo
		
		System.out.println("*********");
	
		String String = "String";
		
		return cadena;
		
	}

}
