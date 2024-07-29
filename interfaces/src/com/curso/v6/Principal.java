package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Interfaces V6 Lambdas");
			                 
		Operacion[] operaciones  = {(x,y)->x+y,
									(z,w)->z-w,
									(d1,d2) -> Math.pow(d1, d2),
									(pato1,pato2) -> pato1*pato2,
									(ope1,ope2) -> ope1/ope2};
		show(operaciones);
	}
	
	static void show(Operacion[] opes) {
		//POLIMORFISMO
		for(Operacion o:opes) {
			//System.out.println(o);
			System.out.println(o.ejecuta(6, 3));
		}
	}

}
