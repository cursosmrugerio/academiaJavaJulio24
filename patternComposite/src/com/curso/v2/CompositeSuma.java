package com.curso.v2;

//                         IS-A
public class CompositeSuma extends Component {
	
	//HAS-A
	Component comLeft;
	Component comRight;
	
	public CompositeSuma(
			Component comLeft, Component comRight) {
		this.comLeft = comLeft;
		this.comRight = comRight;
	}

	@Override
	double getValue() {
		return comLeft.getValue() + comRight.getValue() ;
	}

}
