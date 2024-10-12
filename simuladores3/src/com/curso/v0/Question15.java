package com.curso.v0;

public class Question15 {

	public static void main(String[] args) {

		int num = 97;

		final int i1 = 1;
		final int i2 = 2;
		final int i3 = 3;
		final char i4 = 'a'; //97

		switch (num) {
		case i1, i2:
			System.out.println("Case 2");
		case i3:
			System.out.println("Case 3");
		case i4:
			System.out.println("Case 4");
			break;
		}
	}
}
