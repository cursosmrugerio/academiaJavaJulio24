package com.curso.v3;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V3 LAMBDA");

		Empleado[] arrayEmp = { new Empleado("Patrobas", 40, 20.80), new Empleado("Tercio", 30, 30.80),
				new Empleado("Andronico", 35, 10.80) };

		// Lambda
		Comparator<Empleado> comparatorEdad = (x,y) -> x.edad - y.edad;

		Arrays.sort(arrayEmp, comparatorEdad);

		System.out.println("***ORDENAR POR EDAD***");
		for (Empleado e : arrayEmp)
			System.out.println(e);

		// Lambda
		Comparator<Empleado> comparatorSueldo = (emp1,emp2) -> (int)(emp1.sueldo - emp2.sueldo);

		Arrays.sort(arrayEmp, comparatorSueldo);

		System.out.println("***ORDENAR POR SUELDO***");
		for (Empleado e : arrayEmp)
			System.out.println(e);

		Arrays.sort(arrayEmp, (pato1,pato2) ->  pato1.nombre.compareTo(pato2.nombre));

		System.out.println("***ORDENAR POR NOMBRE***");
		for (Empleado e : arrayEmp)
			System.out.println(e);

	}

}
