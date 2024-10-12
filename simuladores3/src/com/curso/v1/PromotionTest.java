package com.curso.v1;

public class PromotionTest {
    public static void main(String args[]) {
        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
        
        //  5    5.5
        if (i == f) c++; //false
        
        //            9     ==          8        // false
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        
        System.out.println(c);
    }
}
