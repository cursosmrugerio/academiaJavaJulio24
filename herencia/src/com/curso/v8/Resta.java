package com.curso.v8;

public class Resta extends OperacionAbs {
	
	int x;
	int y;
	
	public Resta(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x-y;
	}

	@Override
	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}
}
