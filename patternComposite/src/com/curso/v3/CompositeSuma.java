package com.curso.v3;

//                         IS-A
public class CompositeSuma implements Component {
	
	//HAS-A
	Component comLeft;
	Component comRight;
	
	public CompositeSuma(
			Component comLeft, Component comRight) {
		this.comLeft = comLeft;
		this.comRight = comRight;
	}

	@Override
	public double getValue() {
		return comLeft.getValue() + comRight.getValue() ;
	}

}
