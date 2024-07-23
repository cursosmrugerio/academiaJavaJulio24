package com.curso.v3;

public class Principal3 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		int res = 0;
		
		try {
			res = ejecuta(x,y);
		} catch (ExcDivEntreCero e) {
			e.printStackTrace();
		} catch (ExcNoNegativo e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
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
