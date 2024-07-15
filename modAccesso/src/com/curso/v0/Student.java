package com.curso.v0;

import java.util.Objects;

public class Student extends Object {
	
	//Variables de Instancia de Clase
	protected String nombre; //null
	int edad; //0
	
//	public Student(){
//		this("Sin nombre",-1);
//	}
	
//	Student(int edad){
//		this("Sin nombre",edad);
//	}
	
	public Student(int edad){
		super();
		nombre = "Sin nombre";
		this.edad = edad;
	}
	
	public Student(String nombre,int edad){
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Student [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return edad == other.edad && 
				Objects.equals(nombre, other.nombre);
	}
	
}
