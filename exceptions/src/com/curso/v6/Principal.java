package com.curso.v6;

public class Principal {

	public static void main(String[] args){
		
		System.out.println("V6");
		
		//Try with Resource
		try (ConexionMongoDb cmd = new ConexionMongoDb()) {
			cmd.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Fin de programa");
		
	}

}
