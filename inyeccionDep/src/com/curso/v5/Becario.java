package com.curso.v5;

public class Becario {
	
	private String nombre;
	private int edad;
	
	//HAS-A
	//BAJO ACOPLAMIENTO
	//INYECCION POR CONSTRUCTOR
	private Computadora compu;
	
	public Becario(String nombre, int edad, Computadora compu) {
		this.nombre = nombre;
		this.edad = edad;
		this.compu = compu;
	}

	void iniciarTrabajo() {
		System.out.println(nombre + ": Enciende compu");
		compu.encenderComputadora();
	}
	
}
