package com.curso.v4;

class SharedResource {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public synchronized void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}

class IncrementThread extends Thread {
	private SharedResource resource;

	public IncrementThread(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			resource.increment();
		}
	}
}

class DecrementThread extends Thread {
	private SharedResource resource;

	public DecrementThread(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			resource.decrement();
		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException  {
		SharedResource resource1 = new SharedResource();
		SharedResource resource2 = new SharedResource();
		Thread t1 = new IncrementThread(resource1);
		Thread t2 = new DecrementThread(resource2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(resource1.getCount());
		System.out.println(resource2.getCount());

	}
}
