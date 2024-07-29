package com.curso.v0;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.nombre.compareTo(o2.nombre);
	}

}
