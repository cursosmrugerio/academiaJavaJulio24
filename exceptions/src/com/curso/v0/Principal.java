package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		// OR
		// true ||  (false) || (false) = true 
		
		
		int x = 5;
		
		if ( x>0 | ++x>10 ) {
			System.out.println("x: "+x); //6
		}
		
		if ( x<0 & ++x>0 ) {
			System.out.println("NO PASO");
		}
		
		System.out.println("x: "+x); //7
	
		
	}

}
