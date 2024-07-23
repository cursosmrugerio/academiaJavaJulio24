package com.curso.v6;

public class ConexionMongoDb implements AutoCloseable {
	
	public void open() throws Exception {
		System.out.println("Abrir conexion MongoDB");
	}
	
	@Override
	public void close()  throws Exception {
		System.out.println("Cerrar conexion MongoDB");
	}
}
