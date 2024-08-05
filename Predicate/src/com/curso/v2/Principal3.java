package com.curso.v2;

public class Principal3 {
	public static void main(String[] args) {
		
		System.out.println("Principal3");
		
		Predicado<String> pre1 =  x -> x.length() > 10;
		
		boolean b = pre1.probar("HolaMundoJava");
		System.out.println(b); //true
		
		Predicado<String> pre2 = cadena -> cadena.length() > 10;
		
		b = pre2.probar("Hola");
		System.out.println(b); //false
		
		Predicado<String> pre3 = w -> w.contains("x");
		
		b = pre3.probar("jaxva");
		System.out.println(b); //true
		
		Predicado<String> pre4 = pato -> pato.endsWith("zz");
		
		b = pre4.probar("jaxvazz");
		System.out.println(b); //true
	}
}
