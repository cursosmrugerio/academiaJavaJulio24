package com.curso.v0;

public class Potencia extends Operacion {
	
	public Potencia(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return (int)(Math.pow(x, y));
	}

}

