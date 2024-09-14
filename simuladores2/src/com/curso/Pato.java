package com.curso;

public class Pato {
	
	String name;
	int contador; //Variable de instancia
	
	public Pato(String name) {
		this(7);
		this.name = name;
	}
	
	public Pato(int edad) {
		
	}
	
	Pato getPato() {
		return new Pato("Donald");
	}
	
//	static int getContador() {
//		return contador;
//	}
	

}
