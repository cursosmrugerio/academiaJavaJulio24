package com.curso.v5;

public class Estudiante  {
	
	//ENCAPSULAR
	private String nombre; //VARIABLE DE INSTANCIA DE CLASE (OBJETOS)
	private int edad;
	private static int contador; //0 //VARIABLE DE LA CLASE
	public static String claveEscuela; //null
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	public static String getClaveEscuela() {
		return claveEscuela;
	}
	
	public static void setClaveEscuela(String cve) {
		claveEscuela = cve;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
