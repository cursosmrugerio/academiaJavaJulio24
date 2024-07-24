package demoSwitch;

public class Principal2 {

	public static void main(String[] args) {

		Integer dayOfWeek = 7;
		
		final int DIA3 = 3;
		
		switch(dayOfWeek) {
		
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case DIA3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Sabado");
		}
		
	}

}
