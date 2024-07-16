package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("Patrobas",5);
		Estudiante e2 = new Estudiante("Tercio",9);
		Estudiante e3 = new Estudiante("Epeneto",12);
		Estudiante e4 = new Estudiante("Andronico",19);

		System.out.println(e1.contador); //1
		System.out.println(e2.contador); //1
		System.out.println(e3.contador); //1
		System.out.println(e4.contador); //1
		
		System.out.println(e3.nombre);
	
	}

}
