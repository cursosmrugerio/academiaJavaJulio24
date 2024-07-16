package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5");
			
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		Operacion ope4 = new Division(8,4);
		Operacion ope5 = new Potencia(8,4);
		//                           0  , 1  , 2  , 3  , 4  , 5   
		Operacion[] operaciones  = {ope0,ope1,ope2,ope3,ope4,ope5};
		
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
