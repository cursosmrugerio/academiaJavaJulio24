package com.curso.v5;

public class Principal2 {

	public static void main(String[] args){

		ConexionMongoDb cmd = new ConexionMongoDb();
		
		try {
			cmd.open();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				cmd.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fin de programa");
		
	}

}
