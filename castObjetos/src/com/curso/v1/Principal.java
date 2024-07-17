package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Object ave1 = new Aguila();
		
		((Ave)ave1).volar(); 
		
		((Aguila)ave1).volarAguila(); 
		
		ave1.toString();
	}

}
