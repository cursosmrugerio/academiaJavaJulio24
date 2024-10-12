package com.curso.v1;

public class TestClass {

    public static int m1(int i) {
        return ++i;
    }

    public static void main(String[] args) {
        int k = m1(args.length);
        k += 3 + k++;
        System.out.println(k); 
    }

}
