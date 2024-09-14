package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		int value = 33;
		
	    if (value >= 0) {
	        if (value != 0) {
	            System.out.print("the ");
	        } else {
	            System.out.print("quick ");
	        }
	        if (value < 10) {
	            System.out.print("brown ");
	        }
	        if (value > 30) {
	            System.out.print("fox ");
	        } else if (value < 50) {
	            System.out.print("jumps ");
	        } else if (value < 10) {
	            System.out.print("over ");
	        } else {
	            System.out.print("the ");
	        }
	        if (value > 10) {
	            System.out.print("lazy ");
	        } else {
	            System.out.print("dog ");
	        }
	        System.out.print("... ");
	    }
	}

	
}
