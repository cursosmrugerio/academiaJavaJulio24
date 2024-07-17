package com.curso.v2;

public class Potencia implements Operacion {
	
	int x;
	int y;
	
	public Potencia(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}
	
	@Override
	public double ejecuta(double x, double y) {
		return Math.pow(x, y);
	}

	@Override
	public String toString() {
		return "Pontencia [x=" + x + ", y=" + y + "]";
	}
}


