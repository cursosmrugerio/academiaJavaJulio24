package apxJava.v1;


class Animal {
    void makeSound() throws Exception {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
	@Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class Main {

	public static void main(String[] args)  {
		
		Animal dog = new Dog();
		try {
			dog.makeSound();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
