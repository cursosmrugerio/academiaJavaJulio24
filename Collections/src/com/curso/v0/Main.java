package com.curso.v0;

import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws ParseException {
		
		Queue<String> products = new ArrayDeque<String>();
		
		products.add("p1");
		products.add("p2");
		products.add("p3");
		
		System.out.println(products.peek()); //p1 NO LO QUITA
		System.out.println(products.poll()); //p1 LO QUITA
		System.out.println("");
				
						 //Consumer   
		products.forEach(System.out::println); //p2, p3
		
	}
}
