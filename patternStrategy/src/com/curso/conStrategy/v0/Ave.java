package com.curso.conStrategy.v0;

import com.curso.conStrategy.ComportamientoVolar;

public abstract class Ave {
	
	ComportamientoVolar cv;
	
	abstract void volar();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
