package com.curso.v1;

public class Estudiante  {
	
	//HAS-A
	String nombre;
	int edad;
	
	static int contador; //0 //VARIABLE DE LA CLASE
	
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
