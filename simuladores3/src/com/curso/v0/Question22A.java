package com.curso.v0;

import java.util.Arrays;

public class Question22A {
	
	public static void main(String[] args) {
		
//                          0
//                            0    ,  1    , 2
//                             0,1     0,1     0,1
		
		int[][][] array3D = {{{0, 1}, {2, 3}, {4, 5}}};
		
		//array3D[0][0] = {0, 1}
		
		//System.out.println(array3D[0][0]);
		System.out.println(Arrays.toString(array3D[0][0])); //{0, 1}
		System.out.println(Arrays.toString(array3D[0][2])); //{4, 5}
		
		int[] array   = {0, 1};
		array3D[0][1] = new int[]{6, 7};
		
		System.out.println(Arrays.toString(array3D[0][1])); //{6, 7}

		
	}

}
