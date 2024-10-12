package com.curso.v0;

public class Question21 {
	
	public static void main(String[] args) {
		
		
		//                0,1,2,3
		int[] arrayUni = {1,2,3,4};
		
		//                  0   , 1
		//                  0,1   0,1
		int[][] arrayBi = {{1,2},{3,4}};
		
		
		//                   0
		//                    0       1
		//                      0,1   0,1
		int[][][] arrayTri = {{{1,2},{3,4}}};
		System.out.println("***:"+arrayTri[0][1][0]); //3
		
		//int[][] array2D = {{0, 1, 2, 4},{5, 6}};
		
		//int[][] array2D = new int[2][];
		
		//int[] array3D [][] = new int[2][][];
		
		//                   0
		//                     0    ,  1    , 2
		//                     0,1     0,1     0,1
		int[][][] array3D = {{{0, 1}, {2, 3}, {4, 5}}};
		
		System.out.println(array3D[0][2][1]); //5
		
		int[] array = {0, 1};
		
		
		
		
		
		
	}

}
