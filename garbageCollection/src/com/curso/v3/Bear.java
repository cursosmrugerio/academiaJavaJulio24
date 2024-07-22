package com.curso.v3;

public class Bear {
	
	//HAS-A
    private Bear pandaBear;
    
    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }
    
    public static void main(String[] args) {
        Bear brownBear = new Bear(); 
        Bear polarBear = new Bear(); 
        
        polarBear.roar(brownBear);
        
        System.out.println(polarBear.pandaBear == brownBear);
        
        brownBear = null;
        polarBear.pandaBear = null;
        
        
        
       

        
        
        
        
        
        
        
        
    }
}
