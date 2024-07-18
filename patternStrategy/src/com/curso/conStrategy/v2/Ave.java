package com.curso.conStrategy.v2;

import com.curso.conStrategy.ComportamientoVolar;
import com.curso.conStrategy.*;

public abstract class Ave {
	
	ComportamientoVolar cv;
	
	Ave(){
		cv = new NoVolar();
	}
	
	void volar() {
		cv.ejecutarVuelo();
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
