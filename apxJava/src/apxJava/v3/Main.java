package apxJava.v3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String str = "1a2b3c4d5e6f";
		String[] splitStr = str.split("\\D");
		
		System.out.println(Arrays.toString(splitStr));
		
		for (String s:splitStr) {
			System.out.println(s);
		}
		
		
	}
}
