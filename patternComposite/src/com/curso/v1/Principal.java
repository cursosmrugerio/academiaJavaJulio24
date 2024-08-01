package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		double d1 = 5.0;	
		Component c1 = new LeafConstante(d1);
		System.out.println(d1 == c1.getValue()); 
		
		double d2 = 8.0;	
		Component c2 = new LeafConstante(d2);
		System.out.println(d2 == c2.getValue());
		
		Component c3 = new CompositeSuma(c1,c2);
		
		System.out.println(c3.getValue());
		
		System.out.println("*************");
		
		System.out.println(
				new CompositeSuma(
						new CompositeSuma(
							new LeafConstante(1),
							new CompositeSuma(
								new LeafConstante(3),
								new LeafConstante(4)
							)
						),
						new CompositeSuma(
							new LeafConstante(5),
							new LeafConstante(2)	
						)
				).getValue()
		);
		
		
		
	}

}
