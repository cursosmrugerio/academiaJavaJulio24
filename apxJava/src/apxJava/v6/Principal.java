package apxJava.v6;

public class Principal {

	public static void main(String[] args) {
		ifTest(false);
	}

	public static void ifTest(boolean flag) {
		if (flag) // 1
			if (flag) // 2
				if (flag) // 3
					System.out.println("False True"); // <== TRUE
				else // 4
					System.out.println("True False");// <== NO SE IMPRIME NUNCA
			else // 5
				System.out.println("True True"); // <== NO SE IMPRIME NUNCA
		else // 6
			System.out.println("False False");// <== FALSE
	}

}
