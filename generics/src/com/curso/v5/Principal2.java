package com.curso.v5;

public class Principal2 {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		show(intArray);
		show(charArray);


	}
	
	static void show(Integer[] intArray) {
		for(int i : intArray)
			System.out.println(i);
	}
	
	static void show(Character[] charArray) {
		for(char i : charArray)
			System.out.println(i);
	}

}
