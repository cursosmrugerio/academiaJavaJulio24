package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		DiaSemana dayOfWeek = DiaSemana.SABADO;
		
		switch(dayOfWeek) {
		
		case DOMINGO:
			System.out.println("Domingo");
			break;
		case LUNES:
			System.out.println("Lunes");
			break;
		case MARTES:
			System.out.println("***Martes");
			break;
		case MIERCOLES:
			System.out.println("Miercoles");
			break;
		case JUEVES:
			System.out.println("Jueves");
			break;
		case VIERNES:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("***Sábado");
		}
		
	}

}
