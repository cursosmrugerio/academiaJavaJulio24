package com.curso.v0;

public class Becario {
	
	String nombre;
	int edad;
	
	//ALTO ACOPLAMIENTO
	ComputadoraWindows cw = new ComputadoraWindows("XP");
	
	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void iniciarTrabajo() {
		System.out.println(nombre + ": Enciende compu");
		cw.encenderComputadora();
	}
	

}
