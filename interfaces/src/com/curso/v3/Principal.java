package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Operacion ope1 = new Suma();
		
		System.out.println("*****abstract*******");
		System.out.println(ope1.ejecuta(10, 5));
		
		System.out.println("*****static*******");
		Operacion.ejecutaStatic(4, 2);
		
		System.out.println("*****default*******");
		ope1.ejecutaDefault(6, 3);
	}

}
