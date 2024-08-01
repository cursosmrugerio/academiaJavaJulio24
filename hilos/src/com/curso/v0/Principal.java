package com.curso.v0;

class MyRunnable implements Runnable {
	@Override
    public void run() {
        System.out.println("Thread is running:"+ this);
    }
}

public class Principal {
    public static void main(String[] args) {
    	System.out.println("INICIO");
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.setName("Hilo1");
        t2.setName("Hilo2");
        t1.start();
        t2.start();
    	System.out.println("FIN");

    }
}
