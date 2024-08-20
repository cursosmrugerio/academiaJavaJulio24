package com.curso.v0;

public class PrintData5 {
	
	public static void main(String[] args) {
		
		System.out.println("INICIO PRINCIPAL V5");
		
		new Thread(() -> {
						for (int i = 0; i < 3; i++)
						System.out.println("Printing record: " + i);
						return;
					}).start();
						
		System.out.println("FIN PRINCIPAL");

	}

}