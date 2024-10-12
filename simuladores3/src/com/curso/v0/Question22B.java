package com.curso.v0;

import java.util.Arrays;

public class Question22B {
	
	public static void main(String[] args) {
		
//                           0
//                            0    ,  1    ,  2
//                             0,1     0,1     0,1
		
		int[][][] array3D = {{{0, 1}, {2, 3}, {4, 5}}};
		
		int[] array = {0, 1};
		
		array3D[0][0] = array;

		array3D[0][1] = array;
		
		array3D[1][0] = array; //ArrayIndexOutOfBoundsException
		
		//System.out.println(Arrays.toString(array3D));
		
		for (int[][] array2D:array3D) {
			
			for (int[] array1D:array2D) {
				
				System.out.println(Arrays.toString(array1D));
				
			}
			
		}

		
	}

}
