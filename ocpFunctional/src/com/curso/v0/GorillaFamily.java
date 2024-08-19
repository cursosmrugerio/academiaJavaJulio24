package com.curso.v0;

interface Gorilla { 
    String move(); 
}

class GorillaFamily {
	//HAS-A
    String walk = "walk";

    void everyonePlay(boolean baby) {
    	walk = "other";
    	
    	//Effectively Final (LOCALES)
        String approach = "amble";
        //approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move()); //EJECUTAN LAS LAMBDA
    }
}

