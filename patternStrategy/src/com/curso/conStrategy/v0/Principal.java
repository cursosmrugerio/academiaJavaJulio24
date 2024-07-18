package com.curso.conStrategy.v0;

import com.curso.conStrategy.v0.strategy.*;

public class Principal {
	
	public static void main(String[] args) {
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();
		
		Ave ave = new Aguila();
		System.out.println(ave);
		ave.cv = cv1;
		ave.volar(); 
		
		ave = new Pinguino();
		System.out.println(ave);
		ave.cv = cv2;
		ave.volar();
		
		ave = new Pato();
		System.out.println(ave);
		ave.cv = cv3;
		ave.volar();
	}

}
