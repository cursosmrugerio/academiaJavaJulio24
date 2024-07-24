package com.curso.v3;

public class Becario {
	
	String nombre;
	int edad;
	
	//HAS-A
	//BAJO ACOPLAMIENTO
	//INYECCION POR PROPIEDAD (ATRIBUTO, CAMPO, ETC)
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
