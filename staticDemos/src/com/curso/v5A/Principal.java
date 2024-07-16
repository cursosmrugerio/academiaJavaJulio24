package com.curso.v5A;

import com.curso.v5.Estudiante;

import static com.curso.v5.Estudiante.getContador;
import static com.curso.v5.Estudiante.setClaveEscuela;
import static com.curso.v5.Estudiante.getClaveEscuela;
import static com.curso.v5.Estudiante.claveEscuela;

//import static com.curso.v5.Estudiante.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V5*");
		System.out.println(getContador()); //0
		
		Estudiante e1 = new Estudiante("Patrobas",5);
		Estudiante e2 = new Estudiante("Tercio",9);
		Estudiante e3 = new Estudiante("Epeneto",12);
		Estudiante e4 = new Estudiante("Andronico",19);
		
		System.out.println(getContador()); //4
		
		System.out.println(e3.getNombre());
		
		setClaveEscuela("UPPITA");
		System.out.println(getClaveEscuela()); //

	
	}

}
