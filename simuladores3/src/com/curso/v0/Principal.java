package com.curso.v0;

class Principal {
	
	static class Other{
		
	}
	
	enum DiaSemana{
		LUNES,MARTES,MIERCOLES,JUEVES
	}

	public static void main(String[] args) {
		
		//byte, short, char, int
		//Byte, Short, Character, Integer
		//String
		//Enum
		
		DiaSemana dayOfWeek = DiaSemana.LUNES;

		switch (dayOfWeek) { 
		case LUNES: System.out.println("Monday"); 
		case MARTES: System.out.println("Tuesday"); 
		case MIERCOLES: System.out.println("Other day"); 
		break;
		}
		
	}

}
