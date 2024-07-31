package com.curso.v8;

public class A {
	
	A(){}
	
	void ejecuta()  throws Exception {}
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

class B extends A{
	
	B() throws Exception {}
	
	@Override
	void ejecuta() {}
}
