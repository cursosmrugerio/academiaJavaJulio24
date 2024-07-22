package com.curso.v0;

public class Principal01 {

	public static void main(String[] args) {

		new Principal01().ejecuta();
		
		otroEjecuta();
	}

	void ejecuta() {
		System.out.println("Ejecuta method Instancia");
	}
	
	private static void otroEjecuta() {
		System.out.println("Ejecuta method Static");
		
	}
}
