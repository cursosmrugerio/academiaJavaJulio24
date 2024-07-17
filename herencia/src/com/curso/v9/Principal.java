package com.curso.v9;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V9");
			                 
		Operacion[] operaciones  = {new Suma(8,4),
									new Resta(8,4),
									new Potencia(8,4),
									new Multi(8,4),
									new Division(8,4)};
		show(operaciones);
	}
	
	static void show(Operacion[] opes) {
		//POLIMORFISMO
		for(Operacion o:opes) {
			System.out.println(o);
			System.out.println(o.ejecuta());
		}
	}

}
