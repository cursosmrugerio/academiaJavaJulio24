package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		System.out.println(Estudiante.contador); //0
		
		Estudiante e1 = new Estudiante("Patrobas",5);
		Estudiante e2 = new Estudiante("Tercio",9);
		Estudiante e3 = new Estudiante("Epeneto",12);
		Estudiante e4 = new Estudiante("Andronico",19);

		System.out.println(e1.contador); //4
//		System.out.println(e2.contador); //4
//		System.out.println(e3.contador); //4
//		System.out.println(e4.contador); //4
		
		System.out.println(Estudiante.contador); //4



	
	}

}
