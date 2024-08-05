package xyz;

public class App {
	
    public static void main(String[] args) throws Exception {
        int j=0,k=0;
        int x=2,y=3,z=4;

        for (int i = 0; i < x; i++) {
            do {
                k=0;
                while (k<z) { 
                    k++;
                    System.out.print(k+""); //1234 1234 1234 --- 1234
                }
                System.out.println("");
                j++;
            }while(j<y); 
            System.out.println("---");    
        }
        //j   k   x  y   z   i
        //0   0   2  3   4   0
        //    1
        //    2
        //    3
        //    4
        //1   0
        //    1
        //    2
        //    3
        //    4
        //2   0
        //    1
        //    2
        //    3
        //    4
        //3 
    }

}
