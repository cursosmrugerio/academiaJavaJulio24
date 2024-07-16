

import java.util.Random;

interface Animal {
	void getSound();
}

class Gato implements Animal {
	@Override
	public void getSound() {
		System.out.println("Miua miau");
	}
}

class Perro implements Animal {
	@Override
	public void getSound() {
		System.out.println("Guau guau");
	}
}

class Pato implements Animal {
	@Override
	public void getSound() {
		System.out.println("Kuaq kuaq");
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Animals Interface");
		Pato pato = new Pato();
		pato.getSound();
		
		pato = new Pato();
		pato.getSound();
		
		System.out.println("**********");
		
		Animal animal = new Pato();
		animal.getSound();
		
		animal = new Perro();
		animal.getSound();
		
		animal = new Gato();
		animal.getSound();

		System.out.println("**********");
		
		animal = getAnimal();
		animal.getSound();


	}

	private static Animal getAnimal() {
		Animal[] animals = {
				new Pato(),
				new Perro(),
				new Gato()
		};
		
		//0,1,2
		int i = new Random().nextInt(animals.length);
		
		System.out.println(animals[i].getClass().getSimpleName());
		
		return animals[i];
	}

}
