package com.curso.v2;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V2");

		Empleado[] arrayEmp = { new Empleado("Patrobas", 40, 20.80), new Empleado("Tercio", 30, 30.80),
				new Empleado("Andronico", 35, 10.80) };

		// CLASE ANONIMA
		Comparator<Empleado> comparatorEdad = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o2.edad - o1.edad;
			}
		};

		Arrays.sort(arrayEmp, comparatorEdad);

		System.out.println("***ORDENAR POR EDAD***");
		for (Empleado e : arrayEmp)
			System.out.println(e);

		// CLASE ANONIMA
		Comparator<Empleado> comparatorSueldo = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int) (o1.sueldo - o2.sueldo);
			}
		};

		Arrays.sort(arrayEmp, comparatorSueldo);

		System.out.println("***ORDENAR POR SUELDO***");
		for (Empleado e : arrayEmp)
			System.out.println(e);

		Arrays.sort(arrayEmp, new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o2.nombre.compareTo(o1.nombre);
			}
		});

		System.out.println("***ORDENAR POR NOMBRE***");
		for (Empleado e : arrayEmp)
			System.out.println(e);

	}

}
