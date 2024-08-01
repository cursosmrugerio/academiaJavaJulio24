package com.curso.v0;

public class Bees {
	public static void main(String[] args) {
		try {
			new Bees().go();
		} catch (Exception e) {
			System.out.println("thrown to main");
		}
		System.out.println("Fin de Programa");
	}

	synchronized void go() throws InterruptedException {
		Thread t1 = new Thread();
		t1.start();
		System.out.print("1 ");
		t1.wait(5000);
		System.out.print("2 ");
	}

	// El uso de t1.wait(5000) en un contexto sincronizado es incorrecto porque wait
	// debe ser llamado en el objeto que posee el monitor, que en este caso sería
	// this, no t1. Debido a esto, se lanzará una excepción
	// IllegalMonitorStateException, que será capturada por el bloque catch en el
	// método main, y se imprimirá "thrown to main".
}
