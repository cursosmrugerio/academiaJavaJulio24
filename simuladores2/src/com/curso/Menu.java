package com.curso;

class Menu {
	public static void main(String[] args) {
		String[] breakfast = {"beans", "egg", "ham", "juice"};
		for (String rs : breakfast) {
			int dish = 1;
			while (dish < breakfast.length) {
			System.out.println(rs + "," + dish);
			dish++;
			}
		}
	}
}
