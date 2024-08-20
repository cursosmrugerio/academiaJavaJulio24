package com.curso.v0;

public class PrintData implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);
	}

	
	public static void main(String[] args) {
		
		System.out.println("INICIO PRINCIPAL");
		
		Runnable run1 = new PrintData();
		
		Thread hilo1 = new Thread(run1);
		
		hilo1.start(); //SEGUNDO HILO	
		
		//(new Thread(new PrintData())).start();
		
		System.out.println("FIN PRINCIPAL");

	}

}