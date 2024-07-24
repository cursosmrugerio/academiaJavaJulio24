package com.curso.v5;

public class ComputadoraDummy implements Computadora {
	
	String version;

	public ComputadoraDummy(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderComputadora(){
		System.out.println("Computadora Dummy");
	}
	
	

}
