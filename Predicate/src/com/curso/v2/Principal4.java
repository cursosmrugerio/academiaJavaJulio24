package com.curso.v2;

public class Principal4 {
	public static void main(String[] args) {
		
		System.out.println("Principal4");
		
		Predicado<String> pre1 = x -> x.endsWith("zz");
		
		boolean b = pre1.probar("jaxvazz");
		System.out.println(b); //true
	 
		Predicado<Integer> pre2 = w -> (w + 100) > 1000; //DEFINICION LAMBDA
		b = pre2.probar(901); //EJECUCION DE LA LAMBDA
		System.out.println(b); //true
		
		Predicado<StringBuilder> pre3 = z -> z.append(true).length() > 10; //DEFINICION LAMBDA
		b = pre3.probar(new StringBuilder("PPYTHON")); //EJECUCION DE LA LAMBDA
		System.out.println(b); //true

		
	}
}
