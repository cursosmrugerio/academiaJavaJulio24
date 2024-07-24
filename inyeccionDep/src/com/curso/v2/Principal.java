package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Epeneto",25);
		
		Inyector.inyectarCompu(bec1, "LINUX");
		
		bec1.iniciarTrabajo();
		
		Becario bec2 = new Becario("Tercio",35);
		
		Inyector.inyectarCompu(bec2, "WINDOWS");
		
		bec2.iniciarTrabajo();

		
		
	}

}
