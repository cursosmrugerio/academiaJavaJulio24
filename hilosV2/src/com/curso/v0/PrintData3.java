package com.curso.v0;

public class PrintData3 {
	
	public static void main(String[] args) {
		
		System.out.println("INICIO PRINCIPAL V3");
		
		Runnable run1 = () -> {
			for (int i = 0; i < 3; i++)
				System.out.println("Printing record: " + i);
		};
		
		Thread hilo1 = new Thread(run1);
		
		hilo1.start(); //SEGUNDO HILO	
				
		System.out.println("FIN PRINCIPAL");

	}

}