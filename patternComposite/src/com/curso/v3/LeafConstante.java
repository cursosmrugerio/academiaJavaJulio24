package com.curso.v3;

public class LeafConstante implements Component {
	
	private double valor;
	
	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValue() {
		return valor;
	}

}
