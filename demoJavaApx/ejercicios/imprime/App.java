package imprime;

enum Level {
    ENERO,
    FEBRERO,
    MAYO
  }

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Level myVar = Level.FEBRERO;

    switch(myVar) {
      case ENERO: i++;
      case FEBRERO: i*=10;
      case MAYO:i--;
    }

    System.out.println(i); //-1
  }
}
