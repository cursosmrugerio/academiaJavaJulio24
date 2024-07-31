package com.curso.v0;

class MyThread extends Thread {
	@Override
    public void run() {
        System.out.println("Thread is running:"+this.getName());
    }
}

public class Main {
    public static void main(String[] args) {
    	System.out.println("INICIO");
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.setName("Hilo1");
        t2.setName("Hilo2");
        t1.start();
        t2.start();
    	System.out.println("FIN");

    }
}
