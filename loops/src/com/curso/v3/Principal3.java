package com.curso.v3;

public class Principal3 {

	public static void main(String[] args) throws Exception {
		int i = 1, j = 10;
		//  2      9
		//  3      8
		//  4      7
		//  5      6

		do {
			if (i++ < j--) {
				// 1 < 10
				// 2 < 9
				// 3 < 8
				// 4 < 7
				System.out.println("PASO CONTINUE");
				//continue;
			}
		} while (i < 5);
		      // 2 < 5 
		      // 3 < 5
		      // 4 < 5
		      // 5 < 5

		System.out.println("i=" + i + " j=" + j);
	}
}
