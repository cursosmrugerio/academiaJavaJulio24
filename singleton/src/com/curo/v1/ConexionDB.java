package com.curo.v1;

public class ConexionDB {
	//HAS-A
	private static ConexionDB conDb = new ConexionDB();
	private static int contador;
	
	private ConexionDB(){
		System.out.println("Paso por Constructor");
		contador++;
	}
	
	static public ConexionDB getInstance() {
		return conDb;
	}
	
	static int getContador() {
		return contador;
	}

}
