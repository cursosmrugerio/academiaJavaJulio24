package com.curso.v4;

interface Gorilla { 
    String move(); 
}

class GorillaFamily {
	//HAS-A
    String walk = "walk";
    
    public static void main(String[] args) {
    	System.out.println("V4");
    	new GorillaFamily().everyonePlay(true);
	}

    void everyonePlay(boolean baby) {
        String approach = "amble";
        //approach = "run";

        //LAMBDA
        Gorilla g1 = () -> walk;
        Gorilla g2 = () -> baby ? "hitch a ride" : "run";
        Gorilla g3 = () -> approach;
        	
        play(g1); 
        play(g2); 
        play(g3); 
    }

    static void play(Gorilla g) {
        System.out.println(g.move());
    }
}

