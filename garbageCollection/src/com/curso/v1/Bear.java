package com.curso.v1;

public class Bear {
	
	//HAS-A
    private Bear pandaBear;
    
    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }
    
    public static void main(String[] args) {
        Bear brownBear = new Bear(); //Line 9
        Bear polarBear = new Bear(); //Line 10
        brownBear.roar(polarBear);
        polarBear = null;
        //GC NO PUEDE LLEVARSE OBJETOS (Linea 9 y 10)
        brownBear = null;
        //GC NO PUEDE LLEVARSE OBJETOS (Linea 9 y 10)
        System.gc(); //DEPENDE DE LA JVM
    }
}
