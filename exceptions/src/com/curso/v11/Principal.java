package com.curso.v11;

public class Principal {
	
	public static void main(String[] args) {
		

		try {
			System.out.println("Hello");
		}catch(RuntimeException e) {
			e.getStackTrace();
		}catch(Exception e) {
			e.getStackTrace();
		}catch(Error e) {
			e.getStackTrace();
		}catch(Throwable e) {
			e.getStackTrace();
		}
		
		
	}

}
