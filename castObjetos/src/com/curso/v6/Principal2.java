package com.curso.v6;

public class Principal2 {

	public static void main(String[] args) {

		Object ave1 = new AguilaCalva();
		
		//DownCast
		Ave ave2 = (Ave)ave1;
		ave2.volar();
		
		Aguila ave3 = (Aguila)ave1;
		ave3.volarAguila();
		
		AguilaCalva ave4 = (AguilaCalva) ave1;
		ave4.volarAguilaCalva();
		
		
		
		
		
		
		
		
		
		
	}

}
