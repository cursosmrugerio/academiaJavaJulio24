package com.curso.v4;

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
		
		System.out.println("******Object******");

		Object ave4 = new AguilaCalva();
		
		((Ave)ave4).volar();
		((Aguila)ave4).volarAguila();
		((AguilaCalva)ave4).volarAguilaCalva();

		System.out.println("******2 Object******");

		AguilaCalva ave5 = (AguilaCalva)ave4;
		ave5.volar();
		ave5.volarAguila();
		ave5.volarAguilaCalva();
		
		System.out.println("************");

		Object ave6 = new Aguila();
		
		((Ave)ave6).volar();
		((Aguila)ave6).volarAguila();
		((AguilaCalva)ave6).volarAguilaCalva(); //NO SE PUEDE. ClassCastException
		
	}

}
