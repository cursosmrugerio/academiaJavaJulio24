package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Interfaces V5");
			                 
		Operacion[] operaciones  = {new Suma(),
									new Resta(),
									new Potencia(),
									new Multi(),
									new Division()};
		show(operaciones);
	}
	
	static void show(Operacion[] opes) {
		//POLIMORFISMO
		for(Operacion o:opes) {
			System.out.println(o.ejecuta(6, 3));
		}
	}

}
