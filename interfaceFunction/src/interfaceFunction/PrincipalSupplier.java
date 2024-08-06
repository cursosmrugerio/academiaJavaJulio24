package interfaceFunction;

import java.util.function.Supplier;

import interfaceFunction.pojo.Empleado;

public class PrincipalSupplier {

	public static void main(String[] args) {

		Supplier<String> sup1 = () -> "Java";
		
		System.out.println(sup1.get());
		
		//DEFINICION DE LA LAMBDA
		Supplier<Empleado> sup2 = 
				() -> new Empleado("Patrobas",28,45.67);
				
		//EJECUTA LA LAMBDA
		Empleado e = sup2.get();
		System.out.println(e);
		
		
		Supplier<Double> randomValor = () -> Math.random();
		double d0 = randomValor.get();
		System.out.println(d0);
		
		double d1 = Math.random();
		System.out.println(d1);

		
	}

}
