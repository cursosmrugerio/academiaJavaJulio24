package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Inyección por setter");

		Becario bec1 = new Becario("Epeneto",25);
		
		Inyector.inyectarCompu(bec1, TipoComputadora.WINDOWS);
		
		bec1.iniciarTrabajo();

		
		Becario bec2 = new Becario("Andronico",25);
		
		Inyector.inyectarCompu(bec2, TipoComputadora.MAC);
		
		bec2.iniciarTrabajo();
		
		System.out.println(bec1.getCompu() == bec2.getCompu()); //FALSE


		
		
	}

}
