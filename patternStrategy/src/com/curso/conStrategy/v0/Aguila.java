package com.curso.conStrategy.v0;

public class Aguila extends Ave {

	@Override
	public void volar() {
		cv.ejecutarVuelo(); //DELEGAR
	}

}
