package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3");
		
		System.out.println("Resultado: "+
				new CompositeMulti(
						new CompositeResta(
							new LeafConstante(1),
							new CompositeSuma(
								new LeafConstante(3),
								new LeafConstante(4)
							)
						),
						new CompositeSuma(
							new LeafConstante(5),
							new CompositeDiv(
									new LeafConstante(6),
									new LeafConstante(2)
							)	
						)
				).getValue()
		);
		
		
		
	}

}
