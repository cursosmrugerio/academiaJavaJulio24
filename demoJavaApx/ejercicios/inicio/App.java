package inicio;
import java.util.Arrays;

public class App {
	
    void main(){
        System.out.println("one");
    }
    static void main(String args){
        System.out.println("two");
    }
    public static final void main(String[] args) throws Exception {
    	System.out.println(args); 
    	System.out.println(Arrays.toString(args)); 
    	System.out.println(args.length); 

        System.out.println("three");
    }

    void mina(String args) {
        System.out.println("four");
    }
}

//