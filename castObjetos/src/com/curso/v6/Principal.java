package com.curso.v6;

public class Principal {

	public static void main(String[] args) {

		AguilaCalva ave1 = new AguilaCalva();
		
		ave1.volar();
		ave1.volarAguila();
		ave1.volarAguilaCalva();
		
		//UpCast
		Aguila ave2 = ave1;
		Ave ave3 = ave2;
		Object ave4 = ave3;
		
		
		
		
		
		
		
		
		
	}

}
