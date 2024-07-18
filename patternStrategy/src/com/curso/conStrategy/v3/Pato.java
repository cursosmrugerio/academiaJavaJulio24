package com.curso.conStrategy.v3;

import com.curso.conStrategy.NoVolar;

public class Pato extends Ave {

	Pato(){
		setCv(new NoVolar());
	}
}
