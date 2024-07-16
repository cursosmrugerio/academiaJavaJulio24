package com.curso.v2;

public class Multi extends Operacion {
	
	public Multi(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x*y;
	}

}

