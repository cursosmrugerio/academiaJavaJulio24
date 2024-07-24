package com.curso.v1;

public class Becario {
	
	String nombre;
	int edad;
	
	//ALTO ACOPLAMIENTO
	ComputadoraWindows cw = new ComputadoraWindows("XP");
	ComputadoraLinux cl = new ComputadoraLinux("Ubuntu 18.0");
	
	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	void iniciarTrabajo(String tipoCompu) {
		System.out.println(nombre + ": Enciende compu");
		if (tipoCompu=="WIN")
			cw.encenderComputadora();
		else if (tipoCompu=="LIN") 
			cl.encenderComputadora();
		
	}
	

}
