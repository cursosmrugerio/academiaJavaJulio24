package com.curso.v0;

import java.util.Arrays;
import java.io.PrintStream;

public class Principal4 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		PrintStream ps = System.out;
		
		ps.println("Hola  Mundo");
		
		//              twoD[0],  twoD[1], twoD[2]
		int[][] twoD = {{1,2,3},{4,5,6,7},{8,9,10}};
		
		//System.out.println(twoD[1].length); //4
		System.out.println(twoD[2]);
		System.out.println(Arrays.toString(twoD[2]));
		
		System.out.println(twoD[2].getClass().isArray()); //true
		
		System.out.println("Hello".getClass().isArray());

		System.out.println(twoD[1][2]); //6
		
		System.out.println(twoD);
		
		System.out.println(Arrays.toString(twoD));
		
	}

}
