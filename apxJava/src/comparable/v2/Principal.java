package comparable.v2;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2");
		
		Empleado[] arrayEmp = {
				new Empleado("Patrobas",40,20.80),
				new Empleado("Tercio",30,30.80),
				new Empleado("Andronico",35,10.80)
		};
		
		Arrays.sort(arrayEmp);
		
		for(Empleado e:arrayEmp)
			System.out.println(e);

	}

}
