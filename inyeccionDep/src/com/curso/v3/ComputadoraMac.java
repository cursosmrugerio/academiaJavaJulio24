package com.curso.v3;

public class ComputadoraMac implements Computadora {
	
	String version;

	public ComputadoraMac(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderComputadora(){
		System.out.println("Encender compu Mac: "+version);
	}
	
	

}
