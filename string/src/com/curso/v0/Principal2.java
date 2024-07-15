package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {
		withString();
		System.out.println("*******");
		withStringBuilder();
	}
	
	static void withString() {
		String name = "Andronico";
		
		for (int x=0; x<=10; x++) {
			name = name + x;
			System.out.println(name);
		}
	}
	
	static void withStringBuilder() {
		StringBuilder name = new StringBuilder("Andronico");
		
		for (int x=0; x<=10; x++) {
			name.append(x);
			System.out.println(name);
		}
		
		String nameRes = name.toString();
	}

}
