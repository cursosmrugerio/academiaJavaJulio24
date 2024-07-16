package com.curso.v1;

public class Multi implements Operacion {
	
	int x;
	int y;
	
	public Multi(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x*y;
	}

	@Override
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}
}
