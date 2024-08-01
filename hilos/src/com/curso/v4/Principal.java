package com.curso.v4;


class Run1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Hilo 1");
	}	
}

class Run2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Hilo 2");
	}	
}

public class Principal {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Run1());
		Thread t2 = new Thread(new Run2());
		
		t1.start();
		t2.start();
		
		System.out.println("Fin de Programa");
		
	}

}
