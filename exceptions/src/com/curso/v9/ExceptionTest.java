package com.curso.v9;

class NewException extends Exception {}
class AnotherException extends Exception {}

public class ExceptionTest {
    public static void main(String[] args) throws NewException{
        try {
            m2();
        } finally {
            try {
				m3();
			} catch (AnotherException e) {
				e.printStackTrace();
			}
        }
    }

    public static void m2() throws NewException {
        throw new NewException();
    }

    public static void m3() throws AnotherException {
        throw new AnotherException();
    }
}

