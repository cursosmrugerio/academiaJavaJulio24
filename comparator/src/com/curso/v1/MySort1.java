package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;

public class MySort1 implements Comparator<Integer> {
	
	public static void main(String[] args) {
		Integer[] primes = {2,7,5,3};
		
		MySort1 ms = new MySort1();
		
		Arrays.sort(primes,ms);
		
		for (Integer p2:primes) System.out.print(p2 + " ");
	}

	@Override
	public int compare(Integer x, Integer y) {
		return y.compareTo(x);
	}

}
