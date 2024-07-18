package com.curso.v0;

public class Student {
	
	//HAS-A
	String nombre;
	int edad;
	StringBuilder matricula;
	
	private Computadora compu;

	public Student(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	public Computadora getCompu() {
		return compu;
	}

	public void setCompu(Computadora compu) {
		this.compu = compu;
	}
	
	

}
