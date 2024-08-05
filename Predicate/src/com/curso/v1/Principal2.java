package com.curso.v1;

public class Principal2 {
	public static void main(String[] args) {
		
		System.out.println("Principal2");
		
		Predicado pre1 = new Predicado() {
			@Override
			public boolean probar(String s) {
				return s.length() > 10;
			}
		};
		
		boolean b = pre1.probar("HolaMundoJava");
		System.out.println(b); //true
		
		Predicado pre2 = new Predicado() {
			@Override
			public boolean probar(String s) {
				return s.length() > 10;
			}
		};
		
		b = pre2.probar("Hola");
		System.out.println(b); //false
	}
}
