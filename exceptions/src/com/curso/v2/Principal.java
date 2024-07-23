package com.curso.v2;

public class Principal {

	public static void main(String[] args) throws ExcDivEntreCero {
		
		int x = 8;
		int y = 0;
		
		int res = ejecuta(x,y);
		
		System.out.println("Res: "+res); 
		
		System.out.println("Fin de Programa");
		
	}

	private static int ejecuta(int x, int y) throws ExcDivEntreCero {
		if (y==0)
			throw new ExcDivEntreCero();
		return x/y;
	}

}
