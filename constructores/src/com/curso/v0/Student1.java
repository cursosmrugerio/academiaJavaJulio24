package com.curso.v0;

import java.util.Objects;

public class Student1 {
	
	//Variables de Instancia de Clase
	String nombre = "Sin nombre";
	int edad = -1;
	
	//Overloading (Sobrecarga)
	Student1(){
	}
	
	Student1(int edad){
		this.edad = edad;
	}
	
	Student1(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Student [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student1 other = (Student1) obj;
		return edad == other.edad && 
				Objects.equals(nombre, other.nombre);
	}
	
}
