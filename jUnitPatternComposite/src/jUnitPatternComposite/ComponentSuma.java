package jUnitPatternComposite;

public class ComponentSuma implements Componente {
	
	private Componente comLeft;
	private Componente comRight;

	public ComponentSuma(Componente comLeft, Componente comRight) {
		this.comLeft = comLeft;
		this.comRight = comRight;
	}

	@Override
	public double getValor() {
		return comLeft.getValor() + comRight.getValor() ;
	}

}
