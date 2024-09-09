package com.curso.v10;

public class Principal {

	public static void main(String[] args) {
		demoException();
	}
	
	static void demoException() {
		System.out.println("Hello World");
		throw new RuntimeException();
	}

}
