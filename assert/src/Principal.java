
public class Principal {

	public static void main(String[] args) {
        int age = 17;
        assert age >= 18  : "La edad debe ser mayor o igual a 18";
        //assert age >= 18;
        System.out.println("Edad: " + age);
    }

}
