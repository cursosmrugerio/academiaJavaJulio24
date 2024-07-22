package com.curso.v0;

public class InitClass{
	
    public static void main(String args[ ] ){
        InitClass obj = new InitClass(5);
    }
    
    int m;
    static int il = 5;
    static int i2 ;
    int j = 100;
    int x;
    
    public InitClass(int m){
    	//                  6         40         0         30        5                                          
        System.out.println(il + " " + i2 + " " + x + " " + j + " " + m);
    }
    
    { 
    	j = 30; 
    	i2 = 40; 
    }  // Instance Initializer
    
    static { il++;
    	//System.out.println("il: "+il); //6
    }  // Static Initializer
}
