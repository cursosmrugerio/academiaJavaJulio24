package com.curso.v0;

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

        switch (currentLevel) {
            case LOW: {
                System.out.println("Low level");
                System.out.println("Code: " + currentLevel.getLevelCode());
                break;
            }
            case MEDIUM: {
                System.out.println("Medium level");
                if (currentLevel.getLevelCode() > 1) {
                    System.out.println("Intermediate Level");
                }
                break;
            }
            case HIGH: {
                System.out.println("High level");
                break;
            }
            default: {
                System.out.println("Unknown level");
            }
        }
    }
}
