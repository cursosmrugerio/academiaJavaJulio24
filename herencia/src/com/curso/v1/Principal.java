package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Operacion ope0 = new Operacion(8,4);
		System.out.println(ope0);
		System.out.println(ope0.ejecuta());

		Suma ope1 = new Suma(8,4);
		System.out.println(ope1);
		System.out.println(ope1.ejecuta());
		
		Resta ope2 = new Resta(8,4);
		System.out.println(ope2);
		System.out.println(ope2.ejecuta());
		
		Multi ope3 = new Multi(8,4);
		System.out.println(ope3);
		System.out.println(ope3.ejecuta());
	}

}
