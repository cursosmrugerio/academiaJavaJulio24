package com.curso.v7;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.curso.v7A.Base;
import com.curso.v7A.Derived;

class Base {
    void show() throws IOException {
        System.out.println("Base show");
    }
}

class Derived extends Base {
    void show() throws FileNotFoundException {
        System.out.println("Derived show");
    }
}

public class Principal {
    public static void main(String[] args)  {
    	Base obj = new Derived();
        try {
            obj.show();
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}
