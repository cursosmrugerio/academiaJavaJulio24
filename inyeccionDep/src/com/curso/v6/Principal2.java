package com.curso.v6;

public class Principal2 {

	public static void main(String[] args) {
		
		System.out.println("Inyección por setter");

		Becario bec1 = new Becario("Epeneto",25);
		
		Inyector2.inyectarCompu(bec1, TipoComputadora.WINDOWS);
		
		bec1.iniciarTrabajo();

		
		
		Becario bec2 = new Becario("Andronico",25);
		
		Inyector2.inyectarCompu(bec2, TipoComputadora.WINDOWS);
		
		bec2.iniciarTrabajo();
		
		
		System.out.println(bec1.getCompu() == bec2.getCompu()); //TRUE

		
		
	}

}
