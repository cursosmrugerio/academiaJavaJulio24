package com.curso.v1;

//                          IS-A
public class CompositeResta extends Component {
	
	//HAS-A
	Component comLeft;
	Component comRight;
	
	public CompositeResta(
			Component comLeft, Component comRight) {
		this.comLeft = comLeft;
		this.comRight = comRight;
	}

	@Override
	double getValue() {
		return comLeft.getValue() - comRight.getValue() ;
	}

}
