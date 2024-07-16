package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2");
		
		Operacion ope0 = new Operacion(8,4);
		System.out.println(ope0);
		System.out.println(ope0.ejecuta());

		Operacion ope1 = new Suma(8,4);
		System.out.println(ope1);
		System.out.println(ope1.ejecuta());
		
		Operacion ope2 = new Resta(8,4);
		System.out.println(ope2);
		System.out.println(ope2.ejecuta());
		
		Operacion ope3 = new Multi(8,4);
		System.out.println(ope3);
		System.out.println(ope3.ejecuta());
	}

}
