package com.curso.v2;

public class Becario {
	
	String nombre;
	int edad;
	
	//HAS-A
	//BAJO ACOPLAMIENTO
	Computadora compu;
	
	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	void iniciarTrabajo() {
		System.out.println(nombre + ": Enciende compu");
		compu.encenderComputadora();
	}
	

}
