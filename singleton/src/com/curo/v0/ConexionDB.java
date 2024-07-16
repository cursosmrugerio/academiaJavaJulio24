package com.curo.v0;

public class ConexionDB {
	//HAS-A
	private static ConexionDB conDb;
	private static int contador;
	
	private ConexionDB(){
		System.out.println("Paso por Constructor");
		contador++;
	}
	
	static public ConexionDB getInstance() {
		if (conDb==null)
			conDb = new ConexionDB();
		return conDb;
	}
	
	static int getContador() {
		return contador;
	}

}
