package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Bici bici1 = new Bici("marca1");
		
		Contenedor<Bici> contBici = new Contenedor<>(bici1);
		
		contBici.<StringBuilder>showCertificado(new StringBuilder("xyz101"));
		
		Moto moto1 = new Moto("marca1");
		
		Contenedor<Moto> contMoto = new Contenedor<>(moto1);
		
		contMoto.<String>showCertificado("abc7898");
		
		Motoneta motoneta1 = new Motoneta("marca2");
		
		Contenedor<Motoneta> contMotoneta = new Contenedor<>(motoneta1);
		
		contMotoneta.<Double>showCertificado(1234.89);
		
	}

}
