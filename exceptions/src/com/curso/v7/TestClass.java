package com.curso.v7;

class MyException extends Exception {}

public class TestClass {
    public static void main(String[] args)  {
        TestClass tc = new TestClass();
        try {
            tc.m1();
        } catch (MyException e) {
        	e.printStackTrace();
            try {
				tc.m1();
			} catch (MyException e1) {
				e1.printStackTrace();
			}
        } finally {
        	System.out.println("PASO POR FINALLY");
            try {
            	tc.m2();
            }catch (RuntimeException e) {
				e.printStackTrace();
			}
        }
        
        System.out.println("FIN DE PROGRAMA");
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}
