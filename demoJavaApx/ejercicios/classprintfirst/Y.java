package classprintfirst;
class X {
    X() {System.out.print(1);}
    X(int i ){super(); System.out.print(2);} //<==3
}

public class Y extends X{

    Y() {super(6); System.out.print(3);} //<==2
    Y(int i) {this(); System.out.print(4);} //<== 1
    
    public static void main(String[] args) throws Exception {
        new Y(5);
    }
}

//234
