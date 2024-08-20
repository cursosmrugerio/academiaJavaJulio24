package com.curso.v0;

public class PrintData4 {
	
	public static void main(String[] args) {
		
		System.out.println("INICIO PRINCIPAL V4");
		
		Runnable run1 = () -> {
			for (int i = 0; i < 3; i++)
				System.out.println("Printing record: " + i);
		};
		
		new Thread(run1).start();
						
		System.out.println("FIN PRINCIPAL");

	}

}