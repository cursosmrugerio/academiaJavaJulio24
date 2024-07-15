package com.curso.v1;

import com.curso.v0.Student;

public class OtroPrincipal2 extends Student {
	
	OtroPrincipal2(String nombre,int edad){
		super(nombre,edad);
	}

	public static void main(String[] args) {
		
		OtroPrincipal2 st1 = new OtroPrincipal2("Epeneto",6);
		st1.nombre = "Andronico";
		
		System.out.println(st1);
	}
	
	//HASTA JAVA 8: public, protected, default*, private.
	//JAVA 9: 3 tipos de public (public dentro del modulo, 
	//       public modulos amigos, public para todos)
	
	
	
	

}
