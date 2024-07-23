package com.curso.v1;

public class ExcDivEntreCero extends RuntimeException {
	
	ExcDivEntreCero(){
		super("No se puede dividir entre Cero");
	}

}
