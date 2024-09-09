package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int day = 7;
		printDayOfWeek(day);
	}

	static public void printDayOfWeek(int day) {
		
		switch (day) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		default:
			System.out.print("Invalid value");
		case 2:
			System.out.print("Tuesday");
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
		case 6:
			System.out.print("Saturday");
			break;
		
		}
	}

}
