package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		AguilaCalva ave1 = new AguilaCalva();
		
		ave1.volar();
		ave1.volarAguila();
		ave1.volarAguilaCalva();
		
		System.out.println("************");
		
		Aguila ave2 = new AguilaCalva();
		
		ave2.volar();
		ave2.volarAguila();
		//ave2.volarAguilaCalva();
		
		System.out.println("************");

		Ave ave3 = new AguilaCalva();
		
		ave3.volar();
		//ave3.volarAguila();
		//ave3.volarAguilaCalva();
		
		System.out.println("************");

		Object ave4 = new AguilaCalva();
		
		//ave4.volar();
		//ave4.volarAguila();
		//ave4.volarAguilaCalva();
		
	}

}
