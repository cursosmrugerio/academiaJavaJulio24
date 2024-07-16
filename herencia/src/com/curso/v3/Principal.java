package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Operacion ope0 = new Operacion(8,4);
		show(ope0);

		Suma ope1 = new Suma(8,4);
		show(ope1);
		
		Resta ope2 = new Resta(8,4);
		show(ope2);
		
		Multi ope3 = new Multi(8,4);
		show(ope3);
		
		Division ope4 = new Division(8,4);
		show(ope4);
		
		Potencia ope5 = new Potencia(8,4);
		show(ope5);
	}
	
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope.toString());
		System.out.println(ope.ejecuta());
	}

}
