package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		//1
		
		
		System.out.println(s3.substring(2)); //llo
		System.out.println(s3.substring(2,4)); //ll

		String s4 = new String("Hello");
		String s5 = new String("Hello");
		//3
		
		System.out.println(s1 == s4); //false
		System.out.println(s1.equals(s4)); //true
		
		StringBuilder sb0 = new StringBuilder(80);
		
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
		System.out.println("StringBuilder***");
		System.out.println(sb1.substring(2)); //la
		System.out.println(sb2.substring(2,4)); //la
		
		System.out.println(sb1.equals(sb2)); //false
		
		String s6 = "Hola";
		String s7 = new StringBuilder("Hola").toString().intern();
		
		System.out.println(s6 == s7); //false

		String x = "Hello World"; 
		String z = " Hello World".trim().intern(); 
		System.out.println(x == z); // false
		
		
	}

}
