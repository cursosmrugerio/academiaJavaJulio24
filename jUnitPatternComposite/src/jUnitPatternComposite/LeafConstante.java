package jUnitPatternComposite;

public class LeafConstante implements Componente {

	private double value;
	
	public LeafConstante(double value) {
		this.value = value;
	}

	@Override
	public double getValor() {
		return value;
	}

}
