package com.curso.conStrategy.v3;

import com.curso.conStrategy.v0.strategy.*;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V3");
		
		Ave ave = new Aguila();
		System.out.println(ave+"***");
		ave.volar();
		
		ave = new Pato();
		System.out.println(ave+"***");
		ave.volar();
		
		ave.setCv(new AleatorioVolar());
		ave.volar();
		
		ave = new Pinguino();
		System.out.println(ave+"***");
		ave.volar();
		
	}
}
