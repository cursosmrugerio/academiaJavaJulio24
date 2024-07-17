package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Object ave1 = new Aguila();
		
		Ave ave2 = (Ave)ave1; //DownCasting
		ave2.volar(); 
		
		Aguila ave3 = (Aguila)ave1; //DownCasting
		ave3.volarAguila(); 
		
	}

}
