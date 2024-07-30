package com.curso.v7A;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
	
	Base() throws IOException {
	}
	
    void show() throws IOException {
        System.out.println("Base show");
    }
}

class Derived extends Base {
	
	Derived() throws Exception {
	}
	
    void show() throws FileNotFoundException {
        System.out.println("Derived show");
    }
}

public class Principal2 {
    public static void main(String[] args) throws Exception  {
    	Base obj = new Derived();
        try {
            obj.show();
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}
