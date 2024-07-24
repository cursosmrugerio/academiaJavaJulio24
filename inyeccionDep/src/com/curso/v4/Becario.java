package com.curso.v4;

public class Becario {
	
	private String nombre;
	private int edad;
	
	//HAS-A
	//BAJO ACOPLAMIENTO
	//INYECCION POR SETTER
	private Computadora compu;
	
	public Becario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	void iniciarTrabajo() {
		System.out.println(nombre + ": Enciende compu");
		compu.encenderComputadora();
	}

	public Computadora getCompu() {
		return compu;
	}

	public void setCompu(Computadora compu) {
		this.compu = compu;
	}
	
	

}
