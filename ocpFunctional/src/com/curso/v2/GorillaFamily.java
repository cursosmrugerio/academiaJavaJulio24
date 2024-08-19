package com.curso.v2;

interface Gorilla { 
    String move(); 
}

class GorillaBBB implements Gorilla{
	
	boolean baby;
	
	public GorillaBBB(boolean baby) {
		this.baby = baby;
	}

	@Override
	public String move() {
		return baby ? "hitch a ride" : "run";
	}
}

class GorillaCCC implements Gorilla{
	
	String cadena;
	
	public GorillaCCC(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public String move() {
		return cadena;
	}
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
        
        play(g1); //GorillaAAA
        play(new GorillaBBB(true)); //GorillaBBB
        play(new GorillaCCC(approach)); //GorillaCCC
    }

    static void play(Gorilla g) {
        System.out.println(g.move());
    }
}

