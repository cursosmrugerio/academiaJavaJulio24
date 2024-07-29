package com.curso.v0;

import java.util.Comparator;

public class ComparatorSueldo implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return (int) (o1.sueldo - o2.sueldo);
	}

}
