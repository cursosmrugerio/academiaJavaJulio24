package com.curso.v1;

public class ForSwitch {
    public static void main(String args[]) {
        char i;
        LOOP: for (i = 0; i < 5; i++) { //i=2,4,6
            switch (i++) { //i=1,3,5
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E': System.out.println("F");
            }
        }
    }
}

//C E F
