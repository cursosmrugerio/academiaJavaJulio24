package com.curso.v8;

public class Potencia extends OperacionAbs {
	
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
	public String toString() {
		return "Pontencia [x=" + x + ", y=" + y + "]";
	}
}


