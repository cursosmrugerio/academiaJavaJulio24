package com.curso.v1;

public class Principal3 {

	public static void main(String[] args) {
		
		int x = 8;
		int y = 0;
		int res = 0;
		
		try {
			res = ejecuta(x,y);
		}catch (ExcDivEntreCero e) {
			System.out.println("No se pudo");
		}
		System.out.println("Res: "+res); 
		
		System.out.println("Fin de Programa");
		
	}

	private static int ejecuta(int x, int y) {
		if (y==0)
			throw new ExcDivEntreCero();
		return x/y;
	}

}
