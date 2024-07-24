package com.curso.v5;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Inyección por constructor");
		
		Becario bec0 = Inyector.inyectarCompu("Rolas", 25, TipoComputadora.DUMMY);
		
		bec0.iniciarTrabajo();
		
		Becario bec1 = Inyector.inyectarCompu("Epeneto", 25, TipoComputadora.WINDOWS);
		
		bec1.iniciarTrabajo();
		
		Becario bec2 = Inyector.inyectarCompu("Tercio",35, TipoComputadora.LINUX);
		
		bec2.iniciarTrabajo();
		
		Becario bec3 = Inyector.inyectarCompu("Patrobas",25, TipoComputadora.MAC);
		
		bec3.iniciarTrabajo();
		
	}

}
