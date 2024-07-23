package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
		int x = 1000;
		int y = 4;
		
		int res = 0;
		
		//MULTICATCH
		try {
			res = ejecuta(x,y);
		} catch (ExcDivEntreCero | ExcNoNegativo | UnsupportedOperationException e) {
			e.printStackTrace();
		} 
		finally {
			System.out.println("Paso por Finally");
		}
		
		System.out.println("Res: "+res); 
		
		System.out.println("Fin de Programa");
		
	}

	private static int ejecuta(int x, int y) 
			throws ExcDivEntreCero, ExcNoNegativo {
		if (y==0)
			throw new ExcDivEntreCero();
		else if (y<0)
			throw new ExcNoNegativo();
		else if (x>999)
			throw new UnsupportedOperationException("x no puede ser mayor a 999");
		return x/y;
	}

}
