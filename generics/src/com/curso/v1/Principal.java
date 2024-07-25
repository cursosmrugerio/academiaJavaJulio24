package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Bici bici1 = new Bici("marca1");
		
		Contenedor contBici = new Contenedor(bici1);
		
		Moto moto1 = new Moto("marca1");
		
		Contenedor contMoto = new Contenedor(moto1);
		
	}

}
