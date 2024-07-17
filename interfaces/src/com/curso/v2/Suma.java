package com.curso.v2;

public class Suma implements Operacion {
	
	int x;
	int y;
	
	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x+y;
	}

	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

	@Override
	public double ejecuta(double x, double y) {
		return x + y;
	}
}
