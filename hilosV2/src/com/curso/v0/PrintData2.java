package com.curso.v0;

public class PrintData2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);
	}

	
	public static void main(String[] args) {
		
		System.out.println("INICIO PRINCIPAL");
		
		Runnable run1 = new PrintData2();
		
		run1.run();
		
		System.out.println("FIN PRINCIPAL");

	}

}