package com.curso.conStrategy.v2;

import com.curso.conStrategy.v0.strategy.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Ave ave = new Aguila();
		System.out.println(ave+"***");
		ave.volar();
		
		ave = new Pato();
		System.out.println(ave+"***");
		ave.volar();
		
		ave.cv = new AleatorioVolar();
		ave.volar();
		
		ave = new Pinguino();
		System.out.println(ave+"***");
		ave.volar();
		
	}
}
