package com.curso.conStrategy.v1;

import com.curso.conStrategy.v0.strategy.ComportamientoVolar;

public abstract class Ave {
	
	ComportamientoVolar cv;
	
	abstract void volar();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
