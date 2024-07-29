package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;

public class MySort2 {

	public static void main(String[] args) {
		
		System.out.println("Version Lambda");
		
		Integer[] primes = {2,7,5,3};
				
		Arrays.sort(primes,(z,w)->w.compareTo(z));
		
		for (Integer p2:primes) System.out.print(p2 + " ");
	}

}
