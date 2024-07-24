package com.curso.v1;

public class ComputadoraLinux {
	
	String version;

	public ComputadoraLinux(String version) {
		this.version = version;
	}
	
	void encenderComputadora(){
		System.out.println("Encender compu Linux: "+version);
	}
	
	

}
