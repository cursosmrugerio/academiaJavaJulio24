package apx.academia;

class Foo {
    public int a = 3;
    public void addFive() { 
        a += 5; System.out.print("F "); 
    }
}

class Bar extends Foo {
    public int a = 8; //HIDDEN //13
    @Override
    public void addFive() { 
        this.a += 5; System.out.print("B "); 
    }
}

public class Main {
    public static void main(String[] args) {
        Foo f = new Bar();
        f.addFive(); //B
        System.out.println(f.a); //3
    }
}
