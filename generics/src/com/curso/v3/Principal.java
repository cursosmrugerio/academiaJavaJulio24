package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Bici bici1 = new Bici("marca1");
		
		Contenedor<Bici> contBici = new Contenedor<>(bici1);
		
		Moto moto1 = new Moto("marca1");
		
		Contenedor<Moto> contMoto = new Contenedor<>(moto1);
		
		Motoneta motoneta1 = new Motoneta("marca2");
		
		Contenedor<Motoneta> contMotoneta = new Contenedor<>(motoneta1);		
		
	}

}
