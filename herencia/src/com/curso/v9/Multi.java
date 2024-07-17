package com.curso.v9;

public class Multi extends OperacionAbs {
	
	public Multi(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta() {
		return x*y;
	}

}

