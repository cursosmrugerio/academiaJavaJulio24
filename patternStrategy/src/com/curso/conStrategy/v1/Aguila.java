package com.curso.conStrategy.v1;

public class Aguila extends Ave {

	@Override
	public void volar() {
		cv.ejecutarVuelo(); //DELEGAR
	}

}
