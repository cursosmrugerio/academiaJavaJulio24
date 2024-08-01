package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		double d1 = 5.0;	
		Component c1 = new LeafConstante(d1);
		System.out.println(d1 == c1.getValue()); 
		
		double d2 = 8.0;	
		Component c2 = new LeafConstante(d2);
		System.out.println(d2 == c2.getValue()); 
		
		
	}

}
