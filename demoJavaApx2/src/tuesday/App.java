package tuesday;

import java.util.Arrays;

enum Level {
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES
}

public class App {
    public static void main(String[] args) throws Exception {
    	
    		Level[] arrayLevel = Level.values();
    		
    		System.out.println(Arrays.toString(arrayLevel));
    	
            for (Level level : Level.values()) {
            	
            	System.out.println(level);
            	
                if(level.equals(Level.MARTES)) 
                    System.out.println("red");
                
                if(level == Level.JUEVES){
                    System.out.println("blue");
                }
                
                if(level.equals("LUNES")){
                    System.out.println("Estoy mal");
                }
            }
  }
}
