package com.curso.v5;

public class Potencia implements Operacion {
	
	@Override
	public double ejecuta(double x, double y) {
		return Math.pow(x, y);
	}

}


