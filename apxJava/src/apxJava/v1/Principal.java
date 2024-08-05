package apxJava.v1;

public class Principal {

	public static void main(String[] args) {

		String a = "tic";
		String b = "tac";
		System.out.println( a.substring(0, 2)); // ti
		System.out.println( a.concat("toc")); // tictoc

		System.out.println(a += "game" + b.toUpperCase());

		// ticgameTAC
		
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.substring(1, 3).concat("World");
		
		//elWorld
		
		
		
		
	}

}
