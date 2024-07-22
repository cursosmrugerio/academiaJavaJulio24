package com.curso.v0;

public class InitClass2{
	
    public static void main(String args[ ] ){
        InitClass2 obj1 = new InitClass2(5);
        InitClass2 obj2 = new InitClass2(10);
    }
    
    int m;
    static int il = 5;
    static int i2 ;
    int j = 100;
    int x;
    
    public InitClass2(int m){
    	//                 6          1          1        101        5          
    	//                 6          2          1        101        10 
        System.out.println(il + " " + i2 + " " + x + " " + j + " " + m);
        System.out.println("**************");
    }
    
    { 
    	j++; 
    	i2++; 
    	++x;
    }  // Instance Initializer
    
    static { il++;
    	//System.out.println("il: "+il); //6
    }  // Static Initializer
}
