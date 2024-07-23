package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		int x = 8;
		int y = 0;
		
		int res = ejecuta(x,y);
		
		System.out.println("Res: "+res); 
		
	}

	private static int ejecuta(int x, int y) {
		return x/y;
	}

}
