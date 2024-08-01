package com.curso.v14;

class TestClass implements I1, I2 {
    public void m1() { 
        System.out.println("Hello"); 
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        ((I2) tc).m1();
        
        System.out.println(((I2)tc).VALUE);
    }
}

interface I1 {
    int VALUE = 1;
    void m1();
}

interface I2 {
    int VALUE = 2;
    void m1();
}
