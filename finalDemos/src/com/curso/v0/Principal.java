package com.curso.v0;

public class Principal {

	public static final void main(String[] args) {
		
		//Primitivos
		int x = 1;
		int y = 010; //OCTAL
		
		int binario = 0B101; //BINARIO
		int hexadecimal = 0Xabc78; //HEXADECIMAL
		
		System.out.println(x+y); //9
		System.out.println(hexadecimal);
		
		//****************
		
		final char char1 = 100;
		//char1 = 99;
		
		final StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		//sb = new StringBuilder("Hola");
		//sb = null;
		System.out.println(sb);
		
		final String cadena = "Hola";
		//cadena = "Otro Hola";
		//cadena = null;
		
	}

}
