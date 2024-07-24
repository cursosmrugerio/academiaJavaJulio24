package com.curso.v6;

public class ComputadoraWindows implements Computadora {
	
	String version;

	public ComputadoraWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderComputadora(){
		System.out.println("Encender compu Windows: "+version);
	}
	
	

}
