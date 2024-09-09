package com.curso.v0;


public class SwitchEnumTest {
	
	enum Day {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week");
                break;
            case WEDNESDAY:
                System.out.println("Midweek");
                //break;
            case FRIDAY:
                System.out.println("End of the work week");
                //break;
            default:
                System.out.println("Weekend");
                //break;
        }
    }
}
