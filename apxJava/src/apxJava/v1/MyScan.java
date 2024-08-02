package apxJava.v1;

import java.util.*;

public class MyScan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int accum = 0;
        System.out.println("Please enter 4 integers:");

        for (int x = 0; x < 4; x++) {
            while (true) {
                try {
                    accum += s.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer:");
                    s.next(); // Clear the invalid input
                }
            }
        }

        System.out.println("The sum of the integers is: " + accum);
    }
}
