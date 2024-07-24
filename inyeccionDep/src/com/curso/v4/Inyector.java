package com.curso.v4;

public class Inyector {
	
	static void inyectarCompu
					(Becario bec, TipoComputadora tipoCompu) {
		
		if (tipoCompu == tipoCompu.WINDOWS)
			bec.setCompu(new ComputadoraWindows("Vista"));
		else if (tipoCompu == tipoCompu.LINUX)
			bec.setCompu(new ComputadoraLinux("Fedora 15"));
		else if (tipoCompu == tipoCompu.MAC)
			bec.setCompu(new ComputadoraMac("Sierra"));
		else 
			throw new UnsupportedOperationException("Tipo de Computadora no especificada");

		
	}

}
