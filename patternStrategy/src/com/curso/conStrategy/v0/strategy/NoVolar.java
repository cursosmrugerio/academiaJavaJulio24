package com.curso.conStrategy.v0.strategy;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutarVuelo() {
		System.out.println("No Volar");
	}

}
