package com.curso.v5B;

public class Principal {

	public static void main(String[] args) {

		Bici bici1 = new Bici("marca1");
		
		Contenedor<Bici> contBici = new Contenedor<>(bici1);
				
		Moto moto1 = new Moto("marca2");
		
		Contenedor<Moto> contMoto = new Contenedor<>(moto1);
				
		Motoneta motoneta1 = new Motoneta("marca3");
		
		Contenedor<Motoneta> contMotoneta = new Contenedor<>(motoneta1);
		
		StringBuilder sb1 = new StringBuilder("sb1");
		
//		Contenedor<StringBuilder> contSb = new Contenedor<>(sb1);
//		
//		System.out.println(contSb);
//		
//		Integer integer = 5;
//		
//		Contenedor<Integer> contInteger = new Contenedor<>(integer);
//		
//		System.out.println(contInteger);
	}

}
