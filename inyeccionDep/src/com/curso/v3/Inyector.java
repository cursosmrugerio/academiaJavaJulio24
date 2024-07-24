package com.curso.v3;

public class Inyector {
	
	static void inyectarCompu
					(Becario bec, TipoComputadora tipoCompu) {
		
		if (tipoCompu == tipoCompu.WINDOWS)
			bec.compu = new ComputadoraWindows("Vista");
		else if (tipoCompu == tipoCompu.LINUX)
			bec.compu = new ComputadoraLinux("Fedora 15");
		else if (tipoCompu == tipoCompu.MAC)
			bec.compu = new ComputadoraMac("Sierra");
		else 
			throw new UnsupportedOperationException("Tipo de Computadora no especificada");

		
	}

}
