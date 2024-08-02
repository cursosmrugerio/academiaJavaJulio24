package apxJava.v4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //                   x
        System.arraycopy(array, 2, array, 1, 2);
        //[1, 3, 4, 4, 5]
        
        //System.out.println(Arrays.toString(array));
        System.out.print(array[1]); //3
        System.out.print(array[4]); //5
    }
}
