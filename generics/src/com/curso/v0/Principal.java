package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Bici bici1 = new Bici("marca1");
		
		ContenedorBici contBici = new ContenedorBici(bici1);
		
		Moto moto1 = new Moto("marca1");
		
		ContenedorMoto contMoto = new ContenedorMoto(moto1);
		
	}

}
