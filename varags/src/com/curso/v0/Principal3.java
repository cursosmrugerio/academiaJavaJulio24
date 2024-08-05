package com.curso.v0;

public class Principal3 {
	
	public static void main(String... args ) {
		ejecuta();
		System.out.println("*****");
		ejecuta("A","B","C");
		System.out.println("*****");
		ejecuta(args);
		System.out.println("*****");
		ejecuta("A","B","C","D","E");
	}
	
	static private void ejecuta(String... arrayString) {
		
		for (String cadena : arrayString) {
			System.out.println(cadena);
		}
		
	}

}
