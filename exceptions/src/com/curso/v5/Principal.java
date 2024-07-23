package com.curso.v5;

public class Principal {

	public static void main(String[] args){

		ConexionMongoDb cmd = new ConexionMongoDb();
		
		try {
			cmd.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//AGUAS, NO SE CERRO LA CONEXION
		System.out.println("Fin de programa");
		
	}

}
