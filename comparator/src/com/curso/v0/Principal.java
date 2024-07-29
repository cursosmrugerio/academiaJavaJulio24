package com.curso.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V0");
		
		Empleado[] arrayEmp = {
				new Empleado("Patrobas",40,20.80),
				new Empleado("Tercio",30,30.80),
				new Empleado("Andronico",35,10.80)
		};
		
		Arrays.sort(arrayEmp, new ComparatorEdad());
		
		System.out.println("***ORDENAR POR EDAD***");
		for(Empleado e:arrayEmp)
			System.out.println(e);
		
		Arrays.sort(arrayEmp, new ComparatorSueldo());
		
		System.out.println("***ORDENAR POR SUELDO***");
		for(Empleado e:arrayEmp)
			System.out.println(e);
		
		Arrays.sort(arrayEmp, new ComparatorNombre());
		
		System.out.println("***ORDENAR POR NOMBRE***");
		for(Empleado e:arrayEmp)
			System.out.println(e);

	}

}
