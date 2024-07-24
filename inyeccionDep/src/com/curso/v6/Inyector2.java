package com.curso.v6;

public class Inyector2 {
	
	static Computadora comp1 = new ComputadoraWindows("Vista");
	static Computadora comp2 = new ComputadoraLinux("Fedora 15");
	static Computadora comp3 = new ComputadoraMac("Sierra");
	
	static void inyectarCompu
					(Becario bec, TipoComputadora tipoCompu) {
		
		if (tipoCompu == tipoCompu.WINDOWS)
			bec.setCompu(comp1);
		else if (tipoCompu == tipoCompu.LINUX)
			bec.setCompu(comp2);
		else if (tipoCompu == tipoCompu.MAC)
			bec.setCompu(comp3);
		else 
			throw new UnsupportedOperationException("Tipo de Computadora no especificada");

		
	}

}
