package com.curso.v2;

public class Estudiante  {
	
	//HAS-A
	String nombre;
	int edad;
	
	private static int contador; //0 //VARIABLE DE LA CLASE
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	static int getContador() {
		return contador;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
