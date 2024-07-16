package com.curo.v0;



public class Principal {

	public static void main(String[] args) {

		ConexionDB conn1 = ConexionDB.getInstance();
		ConexionDB conn2 = ConexionDB.getInstance();
		ConexionDB conn3 = ConexionDB.getInstance();
		ConexionDB conn999 = ConexionDB.getInstance();
		
		System.out.println(conn1); //null
		System.out.println(conn2); //null
		System.out.println(conn3); //null
		System.out.println(conn999); //null
		
		System.out.println(ConexionDB.getContador());


	}

}
