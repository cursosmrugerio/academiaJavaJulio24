package interfaceFunction;
import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import interfaceFunction.pojo.Empleado;

public class PrincipalFunction {

	public static void main(String[] args) {
		
		Function<String,Integer> fun1 = 
				y -> y.length();
		int longitud = fun1.apply("Hola Mundo");
		System.out.println(longitud);
		
		Function<Empleado,String> fun2 = 
					z -> z.getNombre();
		Empleado empleado = new Empleado("Patrobas",28,56.79);
		System.out.println(fun2.apply(empleado));
		
		Function<String,String> fun3 = x -> x + "Mundo";
		System.out.println(fun3.apply("Hola "));
		
		UnaryOperator<String> fun4 = x -> x + "Mundo";
		System.out.println(fun4.apply("Hola "));
		
		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		UnaryOperator<Empleado> uo = emp -> {
			emp.setSueldo(emp.getSueldo()*1.10);
			return emp;
		};
		
		listaEmpleados.replaceAll(uo);
		
		listaEmpleados.forEach(emp -> System.out.println(emp));
		
		listaEmpleados.removeIf(x -> x.getSueldo() < 45);
		
		System.out.println("******");
		
		listaEmpleados.forEach(emp -> System.out.println(emp));

		
		
		
	}
}
