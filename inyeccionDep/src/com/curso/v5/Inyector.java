package com.curso.v5;

public class Inyector {
	
	static Becario inyectarCompu
				(String nombre, int edad, TipoComputadora tipoCompu) {
		
		if (tipoCompu == tipoCompu.WINDOWS)
			return new Becario(nombre,edad,new ComputadoraWindows("XP"));
		else if (tipoCompu == tipoCompu.LINUX)
			return new Becario(nombre,edad,new ComputadoraLinux("Fedora 15"));
		else if (tipoCompu == tipoCompu.MAC)
			return new Becario(nombre,edad,new ComputadoraMac("Sierra"));
		else if (tipoCompu == tipoCompu.DUMMY)
			return new Becario(nombre,edad,new ComputadoraDummy("ZZZZZ"));
		else 
			throw new UnsupportedOperationException("Tipo de Computadora no especificada");

		
	}

}
