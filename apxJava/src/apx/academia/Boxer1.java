package apx.academia;

public class Boxer1 {
    Integer i = 0;
    int x;

    public Boxer1(int y) {
        x = i + y;
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Boxer1(new Integer(4));
        
        new Boxer1(new Short((short)4));
    }
}