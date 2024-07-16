package com.curso.v4;

public class Estudiante  {
	
	//ENCAPSULAR
	private String nombre; //VARIABLE DE INSTANCIA DE CLASE (OBJETOS)
	private int edad;
	private static int contador; //0 //VARIABLE DE LA CLASE
	private static String claveEscuela; //null
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	static String getClaveEscuela() {
		return claveEscuela;
	}
	
	static void setClaveEscuela(String cve) {
		claveEscuela = cve;
	}
	
	static int getContador() {
		return contador;
	}
	
	String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
