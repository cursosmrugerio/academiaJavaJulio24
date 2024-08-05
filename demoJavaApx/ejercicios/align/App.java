package align;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        String[] as = { "111.234", "222.56789456789" };
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(3); //<==
        for (String string : as) {
            System.out.println(format.parse(string));
        }
    }
}
