package com.curso.v6;

public class Principal3 {

	public static void main(String[] args) {

		Object ave1 = new AguilaCalva();
		
		//DownCast
		((Ave)ave1).volar();
		
		((Aguila)ave1).volarAguila();
		
		((AguilaCalva)ave1).volarAguilaCalva();
		
		
		
		
		
		
		
		
		
		
	}

}
