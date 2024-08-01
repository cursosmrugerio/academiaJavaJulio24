package com.curso.v9;

interface Movable {
	void move();
}

abstract class Vehicle {
	abstract void fuel();
}

class Car extends Vehicle implements Movable {
	void fuel() {
		System.out.println("Car is refueled");
	}

	public void move() {
		System.out.println("Car is moving");
	}
}

public class Main {
	public static void main(String[] args) {
		Vehicle myCar = new Car();
		myCar.fuel();
		((Movable)myCar).move();
	}
}