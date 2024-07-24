package demoSwitch;

public class Principal {

	public static void main(String[] args) {

		
		Integer dayOfWeek = 7;
		
		switch(dayOfWeek) {
		
		case 0:
			System.out.println("Domingo");
		case 1:
			System.out.println("Lunes");
		case 2:
			System.out.println("Martes");
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
		case 5:
			System.out.println("Viernes");
		default:
			System.out.println("Sabado");
		}
		
	}

}
