package com.curso.v3;

interface Gorilla { 
    String move(); 
}

class GorillaFamily {
	//HAS-A
    String walk = "walk";
    
    public static void main(String[] args) {
    	everyonePlay(true);
	}

    static void everyonePlay(boolean baby) {
        String approach = "amble";
        approach = "run";

        //CLASE ANONIMA
        Gorilla g1 = new Gorilla() {
        	@Override
        	public String move() {
        		return "walk";
        	}
        };
        
        //CLASE ANONIMA
        Gorilla g2 = new Gorilla() {
        	boolean baby = true;
        	@Override
        	public String move() {
        		return baby ? "hitch a ride" : "run";
        	}
        };
        
        //CLASE ANONIMA
        Gorilla g3 = new Gorilla() {
        	String cadena = "Hello";
        	@Override
        	public String move() {
        		return cadena;
        	}
        };
        
        play(g1); 
        play(g2); 
        play(g3); 
    }

    static void play(Gorilla g) {
        System.out.println(g.move());
    }
}

