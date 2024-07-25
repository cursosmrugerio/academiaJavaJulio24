package com.curso.v5;

public class Principal3 {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		show(intArray);
		Principal3.<Double>show(doubleArray);
		show(charArray);

	}
	
	static <T> void show(T[] arrayT) {
		for(T t : arrayT)
			System.out.println(t);
	}
	
	

}
