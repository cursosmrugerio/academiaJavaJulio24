package com.curso.sinStrategy;

public class Principal {
	
	public static void main(String[] args) {
		Ave ave = new Aguila();
		ave.volar();
		
		ave = new Pinguino();
		ave.volar();
		
		ave = new Pato();
		ave.volar();
	}

}
