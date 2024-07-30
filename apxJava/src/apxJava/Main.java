package apxJava;


class Animal {
    void makeSound() throws Exception {
        System.out.println("Animal makes a sound");
        throw new Exception();
    }
}

public class Main {

	public static void main(String[] args) throws Exception {
		new Animal().makeSound();
	}

}
