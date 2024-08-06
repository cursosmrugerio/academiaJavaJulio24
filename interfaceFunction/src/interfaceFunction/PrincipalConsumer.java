package interfaceFunction;

import java.util.function.Consumer;

import interfaceFunction.pojo.Empleado;

import java.util.*;

public class PrincipalConsumer {

	public static void main(String[] args) {

		//DEFINICION DE LA LAMBDA
		Consumer<String> cons1 = r -> System.out.println(r);
		//EJECUTA LA LAMBDA
		cons1.accept("Hola Java");
		
		Empleado emp = new Empleado("Patrobas",28,45.67);
		Consumer<Empleado> cons2 = 
				w -> System.out.println("Nombre: "+w.getNombre());
		cons2.accept(emp);
		
		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		listaEmpleados.forEach(e -> System.out.println(e));
		//listaEmpleados.forEach(System.out::println); //method reference
	}

}
