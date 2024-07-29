package com.curso.v0;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.edad - o2.edad;
	}

}
