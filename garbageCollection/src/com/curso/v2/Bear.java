package com.curso.v2;

public class Bear {
	
	//HAS-A
    private Bear pandaBear;
    
    private Bear roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
        return b;
    }
    
    public static void main(String[] args) {
        Bear brownBear = new Bear(); 
        Bear polarBear = new Bear(); 
        Bear _2b = brownBear.roar(polarBear);
        
        System.out.println(brownBear.pandaBear == _2b);
        System.out.println(brownBear.pandaBear == polarBear);

        
        
        
        
        
        
        
        
    }
}
