package com.curso.v8;

import java.util.Arrays;

public class TestClass {
    public static void main(String args[]) {
        A[] a, al;
        B[] b;
        a = new A[10]; al = a;
        b = new B[20];
        
        System.out.println(b);
        b[0] = new B();
        b[10] = new B();
        System.out.println(Arrays.toString(b));
        
        a = b;  // 1 UPCASTING
        System.out.println(Arrays.toString(a));
        
        b = (B[])a;  // 2 DOWNCASTING
        
        //al = new B[20];
        
        b = (B[])al;  // 3 classCastException
        
        System.out.println("Fin de programa");
    }
}

class A { }

class B extends A {
	
	@Override
	public String toString() {
		return "B";
	}
}
