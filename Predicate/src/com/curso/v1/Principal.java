package com.curso.v1;

class EsMayor10 implements Predicado{
	@Override
	public boolean probar(String s) {
		return s.length() > 10;
	}
}

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Principal1");
		
		Predicado pre1 = new EsMayor10();
		boolean b = pre1.probar("HolaMundoJava");
		System.out.println(b); //true
		
		Predicado pre2 = new EsMayor10();
		b = pre2.probar("Hola");
		System.out.println(b); //false
	}
}
