package com.curso.v5B;

public class Contenedor<T extends Transportable> {
	
	private T t;

	public Contenedor(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
