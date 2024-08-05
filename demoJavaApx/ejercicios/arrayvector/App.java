package arrayvector;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5,6};

        System.arraycopy(array, 2, array,1,2);
        
        System.out.println(Arrays.toString(array));
        
        System.out.print(array[1]);
        System.out.print(array[4]);
    }
}
