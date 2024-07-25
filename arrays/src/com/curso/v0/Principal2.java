package com.curso.v0;

import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {
		
		int[][] twoA = new int[3][2];
						
		twoA[0][0] = 1;
		twoA[0][1] = 2;
		
		twoA[1][0] = 4;
		twoA[1][1] = 5;

		System.out.println(Arrays.toString(twoA[0]));
		System.out.println(Arrays.toString(twoA[1]));
		System.out.println(Arrays.toString(twoA[2]));

				
	}

}
