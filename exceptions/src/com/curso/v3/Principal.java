package com.curso.v3;

public class Principal {

	public static void main(String[] args) 
			throws ExcDivEntreCero, ExcNoNegativo {
			//throws Exception {
		
		int x = 8;
		int y = -2;
		
		int res = ejecuta(x,y);
		
		System.out.println("Res: "+res); 
		
		System.out.println("Fin de Programa");
		
	}

	private static int ejecuta(int x, int y) 
			throws ExcDivEntreCero, ExcNoNegativo {
			//throws Exception {
		if (y==0)
			throw new ExcDivEntreCero();
		else if (y<0)
			throw new ExcNoNegativo();
		return x/y;
	}

}
