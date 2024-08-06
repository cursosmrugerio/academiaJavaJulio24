package com.curso.v3;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
}
