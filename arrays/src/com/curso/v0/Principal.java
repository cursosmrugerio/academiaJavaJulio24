package com.curso.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		int[][] twoA = new int[3][];
		
		twoA[0] = new int[3];
				
		twoA[0][0] = 1;
		twoA[0][1] = 2;
		twoA[0][2] = 3;
		
		twoA[1] = new int[4];
		
		twoA[1][0] = 4;
		twoA[1][1] = 5;
		twoA[1][2] = 6;
		twoA[1][3] = 7;
		
		twoA[2] = new int[100];

		System.out.println(Arrays.toString(twoA[0]));
		System.out.println(Arrays.toString(twoA[1]));
		System.out.println(Arrays.toString(twoA[2]));

				
		//int[][] twoD = {{1,2,3},{4,5,6,7},{8,9,10}};
	}

}
