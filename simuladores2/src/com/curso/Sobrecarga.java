package com.curso;

public class Sobrecarga {

	public static void main(String[] args) {

		ejecuta(4);

	}

	static void ejecuta(int i) {
		System.out.println("int");
	}

	static void ejecuta(Integer i) {
		System.out.println("Integer");
	}

	static void ejecuta(Object i) {
		System.out.println("Object");
	}

	static void ejecuta(int... i) {
		System.out.println("int varags");
	}

}
