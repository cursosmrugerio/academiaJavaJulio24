package com.curso.conStrategy.v2;

import com.curso.conStrategy.v0.strategy.ComportamientoVolar;
import com.curso.conStrategy.v0.strategy.SiVolar;

public abstract class Ave {
	
	ComportamientoVolar cv;
	
	Ave(){
		cv = new SiVolar();
	}
	
	void volar() {
		cv.ejecutarVuelo();
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
