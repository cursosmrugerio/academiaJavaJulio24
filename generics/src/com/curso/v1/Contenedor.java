package com.curso.v1;

public class Contenedor {
	
	Bici bici;
	Moto moto;
	Motoneta motoneta;

	public Contenedor(Bici bici) {
		this.bici = bici;
	}
	
	public Contenedor(Moto moto) {
		this.moto = moto;
	}
	
	public Contenedor(Motoneta motoneta) {
		this.motoneta = motoneta;
	}

}
