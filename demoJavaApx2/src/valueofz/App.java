package valueofz;

public class App {

	public static void main(String[] args) throws Exception {
        int w=0;
        int a=10;
        int b=37;
        int z=0;
        
        if (a==b) {
            z=3;
        }else if(a>b){
            z=6;
        }
        w=10*z;
        System.out.println("w: " + w); 
        
        char c1 = 190;
        System.out.println(c1);
        
        char c2 = 97;
        System.out.println(c2=='a');
        
        //char c3 = -1;

        
    }
}
