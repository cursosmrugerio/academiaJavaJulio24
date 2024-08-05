package com.curso.v0;

public class Principal4 {
	
	public static void main(String... args ) {
		
	}
	
	static private void ejecuta(Integer[] arrayEntero , String ... arrayString) {
		
		for (String cadena : arrayString) {
			System.out.println(cadena);
		}
		
	}

	static private void ejecuta2(boolean b,String ... arrayString) {
		
		for (String cadena : arrayString) {
			System.out.println(cadena);
		}
		
	}
}
