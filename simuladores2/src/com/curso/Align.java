package com.curso;

import java.text.*;

public class Align {
	public static void main(String[] args) throws ParseException {
		String[] sa = { "111.234", "222.5678" };
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3); // NO HACE NADA
		for (String s : sa) {
			System.out.println(nf.parse(s));
		}
	}
}
