package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		int x = 5;
		x = 10; //0 Objetos
		//x = null; //ERROR DE COMPILACION
		
		String cadena = "Hello"; //INMUTABLE EL OBJETO
		//cadena = "Hola";
		
		cadena.concat(" World"); //2 
		System.out.println(cadena); //Hello
		
		StringBuilder sb = new StringBuilder("Hello"); //MUTABLE
		sb.append("World"); //1
		System.out.println(sb); //Hello World
		
		String otraCadena = "Hola";
		otraCadena = null;
		System.out.println(otraCadena);
		
	
	}

}
