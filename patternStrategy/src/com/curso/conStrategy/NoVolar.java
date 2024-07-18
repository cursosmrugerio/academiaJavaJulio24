package com.curso.conStrategy;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutarVuelo() {
		System.out.println("No Volar");
	}

}
