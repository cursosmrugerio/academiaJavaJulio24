package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("BEGIN"); //MAIN 1
		(new ReadInventoryThread()).start(); //2
		(new Thread(new PrintData())).start(); //3
		(new ReadInventoryThread()).start(); //4
		System.out.println("END");
	}

}
