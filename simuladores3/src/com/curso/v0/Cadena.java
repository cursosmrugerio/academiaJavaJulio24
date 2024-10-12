package com.curso.v0;

public class Cadena {

	public static void main(String[] args) {
		String name = "Joe";
		int age = 31;
		
		String result = "My name is " + name + ", my age is " + age;
		System.out.println(result);

		StringBuilder sb = new StringBuilder(50);
		//sb.append("My name is " + name + ", my age is " + age);
		
		
		//sb.insert(0,"My name is " + name).append(", my age is "+ age);
		
		//sb.insert(0,"My name is ").insert(11,name).insert(13,", my age is ").insert(24,age);
		
		sb.append("My name is ").append(name).append(", my age is ").append(age);
		
		System.out.println(sb);
	}

}
