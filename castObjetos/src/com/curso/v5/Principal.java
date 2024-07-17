package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Object ave1 = new AguilaCalva();
		
		Ave ave2 = (Ave)ave1;
		
		Aguila ave3 = (Aguila)ave2;
		
		Aguila ave4 = null;
		
		if (ave3 instanceof AguilaReal)
			ave4 = (AguilaReal)ave3;
		else if (ave3 instanceof AguilaCalva)
			ave4 = (AguilaCalva)ave3;
		
		ave4.volar(); 
	}

}
