package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		DiaSemana day = DiaSemana.LUNES;
		printDayOfWeek(day);
	}

	static public void printDayOfWeek(DiaSemana day) {
		
		switch (day) {
		case DOMINGO:
			System.out.print("Sunday");
			break;
		case LUNES:
			System.out.print("Monday");
		default:
			System.out.print("Invalid value");
		case MARTES:
			System.out.print("Tuesday");
		case MIERCOLES:
			System.out.print("Wednesday");
			break;
		case JUEVES:
			System.out.print("Thursday");
			break;
		case VIERNES:
			System.out.print("Friday");
		case SABADO:
			System.out.print("Saturday");
			break;
		
		}
	}

}
