package com.curso.v2;

public class Inyector {
	
	static void inyectarCompu
					(Becario bec, String tipoCompu) {
		
		if (tipoCompu == "WINDOWS")
			bec.compu = new ComputadoraWindows("Vista");
		else if (tipoCompu == "LINUX")
			bec.compu = new ComputadoraLinux("Fedora 15");
		else 
			throw new UnsupportedOperationException("Tipo de Computadora no especificada");

		
	}

}
