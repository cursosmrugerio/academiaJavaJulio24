package demoSwitch;

public class Principal3 {

	private int getSortOrder(String firstName) {

		final String middleName = "Patricia";
		final String suffix = "JR";
		final String lastName = "ZZZ";

		int id = 0;

		switch (firstName) {
		
		case "Test":
			return 52;
			
		case middleName: // DOES NOT COMPILE 
			id = 5;
			break;
			
		case suffix:
			id = 0;
			break;
			
		case lastName:
			id = 8;
			break;
			
		case "5":
			id = 7;
			break;
			
		case "J":
			id = 10;
			break;
			
		case "SUNDAY":
			id = 15;
			break;
		}

		return id;
	}
}
