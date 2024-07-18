package com.curso.conStrategy.v2;

import com.curso.conStrategy.v0.strategy.NoVolar;

public class Pato extends Ave {

	Pato(){
		cv = new NoVolar();
	}
}
