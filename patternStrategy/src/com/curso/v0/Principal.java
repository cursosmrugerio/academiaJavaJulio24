package com.curso.v0;

import java.io.IOException;

public class Principal {
	
	private String cadena;
	protected int i;

	public static void main(String[] args) throws IOException{

		Student est1 = new Student("Andronico",20);
		
		est1.setCompu(new CompuLinux()); //Inyectar Compu
		
	}
	
	public void m1() {
		
		//NO SE INICIALIZAN
		//NO SE PUEDEN USAR MODIFICADORES ACCESO
		String otraCadena = null;
		int i = 0;
		
		System.out.println(otraCadena);
		System.out.println(i);
		
	}

}
