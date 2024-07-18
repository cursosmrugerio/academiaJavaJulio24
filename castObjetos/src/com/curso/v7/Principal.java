package com.curso.v7;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Cast V7");
			                 
		Operacion ope1 = new Suma(8,4); //<==
		
		//UpCast
		Object ope2 = ope1;
		
		//DownCast
		if (ope1 instanceof Resta) {
			Resta ope3 = (Resta)ope1;
			System.out.println(ope3);
			System.out.println(ope3.ejecuta());
		}else if (ope1 instanceof Suma) {
			Suma ope3 = (Suma)ope1;
			System.out.println(ope3);
			System.out.println(ope3.ejecuta());
		}
		

	}
	
	

}
