package apxJava.v6;

public class TestClass2 {
    public void method(Object o) {
        System.out.println("Object Version");
    }

//    public void method(java.io.FileNotFoundException s) {
//        System.out.println("java.io.FileNotFoundException Version");
//    }

    public void method(java.io.IOException s) {
        System.out.println("IOException Version");
    }
    
    public void method(java.io.EOFException s) {
        System.out.println("EOFException Version");
    }
    
    public static void main(String[] args) {
        TestClass2 tc = new TestClass2();
        tc.method(null);
    }
}
