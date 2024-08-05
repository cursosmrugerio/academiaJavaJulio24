package testscope;

public class App {
    int z; //VARIABLE DE REFERENCIA DE INSTANCIA DE CLASE
    final public static void main(final String[] args) throws Exception {
        App myapp = new App();
        int z = 6;
        System.out.println(z); //6
        myapp.doStuff();
        System.out.println(z); //6
        System.out.print(myapp.z); //4
    }

    void doStuff() {
        int z = 5;
        doStuff2();
        System.out.println(z); //5
    }
    
    void doStuff2(){
        z=4;
    }
}