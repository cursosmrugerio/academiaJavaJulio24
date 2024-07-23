package com.curso.v2;

public class Principal2 {

	public static void main(String[] args) {
		
		int x = 8;
		int y = 0;
		
		int res = 0;
		
		try {
			res = ejecuta(x,y);
		} catch (ExcDivEntreCero e) {
			System.out.println("No se pudo");
			e.printStackTrace();
		}
		
		System.out.println("Res: "+res); 
		
		System.out.println("Fin de Programa");
		
	}

	private static int ejecuta(int x, int y) throws ExcDivEntreCero {
		if (y==0)
			throw new ExcDivEntreCero();
		return x/y;
	}

}
