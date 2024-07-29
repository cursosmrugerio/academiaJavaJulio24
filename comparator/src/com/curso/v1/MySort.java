package com.curso.v1;

import java.util.Arrays;

public class MySort {
	
	public static void main(String[] args) {
		Integer[] primes = {2,7,5,3};
		
		Arrays.sort(primes);
		
		for (Integer p2:primes) System.out.print(p2 + " ");
	}

}
