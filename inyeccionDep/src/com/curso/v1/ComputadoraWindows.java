package com.curso.v1;

public class ComputadoraWindows {
	
	String version;

	public ComputadoraWindows(String version) {
		this.version = version;
	}
	
	void encenderComputadora(){
		System.out.println("Encender compu Windows: "+version);
	}
	
	

}
