package com.curso.v0;

public class Estudiante  {
	
	//HAS-A
	String nombre;
	int edad;
	int contador; //0 //Variable de la Instancia Clase
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
