package com.curso.v0;

public class Principal5 {
	
	public static void main(String... args ) {
		System.out.println("Hola");
		
		main(new String[][]{});
		
		main(new String[]{"A"},new String[]{"B"});
	}
	
	public static void main(String[]... args ) {
		System.out.println("Hello");
	}
	
}
