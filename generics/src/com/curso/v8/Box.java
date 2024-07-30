package com.curso.v8;

public class Box<T> {

	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() throws ClassCastException {

		if (item instanceof String) {
			return (T)item; // Unsafe cast
		}

		throw new ClassCastException("Item is not a String");

	}

}
