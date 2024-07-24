package com.curso.v6;

public class ComputadoraLinux implements Computadora {
	
	String version;

	public ComputadoraLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderComputadora(){
		System.out.println("Encender compu Linux: "+version);
	}
	
	

}
