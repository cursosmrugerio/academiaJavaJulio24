package com.curso.v0;

public class LeafConstante extends Component {
	
	private double valor;
	
	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	double getValue() {
		return valor;
	}

}
