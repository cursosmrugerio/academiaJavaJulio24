package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		int x = 4 + 5 * 6;
		System.out.println(x);

		int i = 1;
		int j = i++; //j=1 , i=2
		
		//   2==2       2 == 2    j=2 , i==3     
		if ((i==++j) || (i++==j)) {
			i+=j; //i = i + j = 5
		}
		System.out.println(i);
	}

}
