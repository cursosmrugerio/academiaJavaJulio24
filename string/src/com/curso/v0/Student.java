package com.curso.v0;

import java.util.Objects;

public class Student extends Object {
	
	String nombre;
	int edad;
	
	Student(String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return edad == other.edad && 
				Objects.equals(nombre, other.nombre);
	}
	
	

}
