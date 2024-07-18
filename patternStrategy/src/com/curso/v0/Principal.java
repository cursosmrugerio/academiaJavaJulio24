package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Student est1 = new Student("Andronico",20);
		
		est1.setCompu(new CompuLinux()); //Inyectar Compu
		
		
	}

}
