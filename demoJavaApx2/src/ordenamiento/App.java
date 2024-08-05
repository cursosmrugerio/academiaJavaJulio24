package ordenamiento;

public class App {

	public static void main(String[] args) throws Exception {
		// Dada la siguiente cadena se necesita obtener un grupo de elementos por
		// separado.
		// "10000112, 00000000, 10000033", escribe el código necesario para lograr la
		// siguiente salida.
		String arrayNum = "10000112, 00000000, 10000033";

		String[] newArrayNum = arrayNum.split(",");

		for (int i = 0; i < newArrayNum.length; i++) {
			System.out.println("element: " + i + " " + newArrayNum[i]);
		}
	}
}
