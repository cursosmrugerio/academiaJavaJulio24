package com.curso.v0;

public class ReadInventoryThread extends Thread {

	@Override
	public void run() {
		System.out.println("Printing zoo inventory");
	}

	public static void main(String[] args) {
		System.out.println("INICIO HILO MAIN");
		Thread hilo = new ReadInventoryThread();
		hilo.start(); //SEGUNDO HILO
		System.out.println("FIN HILO MAIN");
	}
	
	

}
