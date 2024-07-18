package com.curso.v6;

public class Principal4 {

	public static void main(String[] args) {

		Object ave1 = new AguilaCalva();
		
		//DownCast
		((Ave)(Aguila)(AguilaCalva)(Object)(Ave)ave1).volar();
		
		
	}

}
