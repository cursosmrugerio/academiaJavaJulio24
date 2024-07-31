package com.curso.v10;

//Definimos una excepción genérica personalizada
class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

//Creamos una clase genérica que puede lanzar esa excepción
class GenericClass<T> {
	private T value;

	public GenericClass(T value) throws CustomException {
		if (value == null) {
			throw new CustomException("Valor nulo no permitido");
		}
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) throws CustomException {
		if (value == null) {
			throw new CustomException("Valor nulo no permitido");
		}
		this.value = value;
	}
}

//Clase principal para demostrar el uso de la clase genérica con excepciones
public class Main {
	public static void main(String[] args) {
		
		GenericClass<Double> gd = null;
		
		try {
			gd = new GenericClass(8.0);
		} catch (CustomException e) {
			System.err.println("Excepción atrapada: " + e.getMessage());
		} 
		
		try {
			gd.setValue(null);
		} catch (CustomException e) {
			System.err.println("Excepción atrapada: " + e.getMessage());
		}
		
		System.out.println(gd.getValue());
		
		System.out.println("FIN DE PROGRAMA");

	}
}
