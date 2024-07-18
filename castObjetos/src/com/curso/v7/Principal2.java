package com.curso.v7;

public class Principal2 {

	public static void main(String[] args) {
		
		System.out.println("Pattern Match V7");
			                 
		Operacion ope1 = new Resta(8,4); //<==
		
		//UpCast
		Object ope2 = ope1;
		
		//DownCast
		if (ope1 instanceof Resta ope) {
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}else if (ope1 instanceof Suma otroOpe) {
			System.out.println(otroOpe);
			System.out.println(otroOpe.ejecuta());
		}
		

	}
	
	

}
