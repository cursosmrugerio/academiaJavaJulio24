package com.curso.v10;

public class Main {
    public static void main(String[] args) throws Exception{
        doSomething();
        System.out.println("Fin de Programa");
    }

    private static void doSomething() throws Exception {
        System.out.println("Before if clause"); 
        double d = Math.random();
        System.out.println("Random: "+d);
        if (d > 0.5) {
            throw new Exception();
        }
        System.out.println("After if clause");
    }
}
