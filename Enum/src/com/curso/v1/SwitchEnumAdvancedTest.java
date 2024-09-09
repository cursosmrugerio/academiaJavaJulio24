package com.curso.v1;

public class SwitchEnumAdvancedTest {

    enum Level {
        LOW(1), MEDIUM(2), HIGH(3), OTRO(8);

        private int levelCode;

        Level(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return levelCode;
        }
    }

    public static void main(String[] args) {
    	Level currentLevel = Level.MEDIUM;

    	int resultado = ejecuta(currentLevel);
    	System.out.println("Resultado: "+resultado);
    }
    
    static int ejecuta(Level currentLevel) {
    	
        switch (currentLevel) {
            case LOW: {
                System.out.println("Low level");
                System.out.println("Code: " + currentLevel.getLevelCode());
                return currentLevel.getLevelCode();
            }
            case MEDIUM: {
                System.out.println("Medium level");
                if (currentLevel.getLevelCode() > 1) {
                    System.out.println("Intermediate Level");
                }
                return currentLevel.getLevelCode();
            }
            case HIGH: {
                System.out.println("High level");
                return currentLevel.getLevelCode();
            }
            default: {
                System.out.println("Unknown level");
            }
            
            return 0;
        }
    	
    }
}
