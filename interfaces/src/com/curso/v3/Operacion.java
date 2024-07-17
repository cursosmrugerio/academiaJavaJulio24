package com.curso.v3;

public interface Operacion {

	// abstract public HASTA JAVA7
	int ejecuta(int x, int y);
	
	//PARADIGMA FUNCTIONAL

	// static public JAVA8
	static void ejecutaStatic(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	// default public JAVA8
	default void ejecutaDefault(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	// static private JAVA9
	private static void ejecutaStaticPrivate(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	// private JAVA9
	private void ejecutaPrivate(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
