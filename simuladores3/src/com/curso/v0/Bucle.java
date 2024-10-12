package com.curso.v0;

public class Bucle {

	public static void main(String[] args) {

		int[] at = { 2, 3 };

		for (int x : at) {
			System.out.println(x + ", ");
			if (x < at.length) 
				break;
		}
		
	}

}
