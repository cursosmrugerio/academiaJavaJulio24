package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
//		String cadena = "Hello";
//		System.out.println(cadena.length());
		
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		Operacion ope4 = new Division(8,4);
		Operacion ope5 = new Potencia(8,4);
		
		//                           0  , 1  , 2  , 3  , 4  , 5   
		Operacion[] operaciones  = {ope0,ope1,ope2,ope3,ope4,ope5};
		
		for(int x=0; x < operaciones.length ; x++) {
			show(operaciones[x]); //POLIMORFISMO
		}
		
	}
	
	static void show(Operacion ope) {
		//POLIMORFISMO
		System.out.println(ope.toString());
		System.out.println(ope.ejecuta());
	}

}
