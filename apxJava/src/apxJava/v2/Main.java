package apxJava.v2;

class Animal {
    void makeSound() throws Exception {
        System.out.println("Animal makes a sound");
        throw new Exception();
    }
}
class Dog extends Animal {
    void makeSound() throws RuntimeException {
        System.out.println("Dog barks"); //<==
    }
}
public class Main {
    public static void main(String[] args)  {
        Animal myDog = new Dog();
        try {
            myDog.makeSound();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}