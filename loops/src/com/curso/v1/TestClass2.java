package com.curso.v1;

public class TestClass2 {
	
    int x = 5;
    
    int getX() { return x; }

    public static void main(String args[]) throws Exception {
        System.out.println("inicio");
    	TestClass2 tc = new TestClass2();
        tc.looper();
        System.out.println(tc.x);
        System.out.println("fin");

    }

    //x Instancia     x Local
    //5               0
    //                5
    //                10,9,8,7...0
    
    
    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                this.x = m;
            }
        }
    }
}
