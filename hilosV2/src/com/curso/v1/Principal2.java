package com.curso.v1;

public class Principal2 {

	public static void main(String[] args) {
		System.out.println("BEGIN"); 
		new ReadInventoryThread().run(); 
		new Thread(new PrintData()).run(); 
		new ReadInventoryThread().run();
		System.out.println("END");
	}

}
