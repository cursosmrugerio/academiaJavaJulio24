package com.curso.v0;

public class LoopTest {
	
    int k = 5; //VARIABLE DE INSTANCIA
    
    public boolean checkIt(int k){
    	
    	//         5>0
        return (k--)>0?true:false; 
        //Parámetro k = 4
        
//        if (k-->0)
//        	return true;
//        else 
//        	return false;
    }
    
    //5
    
    public void printThem(){
        while(checkIt(k)){ //5
            System.out.print(k); //5,5,5..........INFINITO
        }
    }
    
    
    
    public static void main(String[] args) {
        new LoopTest().printThem();
    }
}
