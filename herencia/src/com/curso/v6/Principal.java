package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V6");
			                 
		Operacion[] operaciones  = {new Operacion(8,4),
									new Suma(8,4),
									new Resta(8,4),
									new Potencia(8,4),
									new Multi(8,4),
									new Division(8,4)};
		show(operaciones);
	}
	
	static void show(Operacion[] opes) {
		//POLIMORFISMO
		for(int x=0; x < opes.length ; x++) {
			System.out.println(opes[x]);
			System.out.println(opes[x].ejecuta());
		}
		
	}

}
