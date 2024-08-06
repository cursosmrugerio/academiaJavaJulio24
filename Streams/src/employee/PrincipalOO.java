package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalOO {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {
		
		List<Employee> listEmpleados = Arrays.asList(arrayOfEmps);
		
		//1.Filtrar los que ganan menos de 400
		
		List<Employee> listaEmp2 = new ArrayList<>();
		
		for (Employee e:listEmpleados) {
			if (e.getSalary()<400)
				listaEmp2.add(e);
		}
		
		//2.Incrementar su sueldo en 200
		
		for (Employee e: listaEmp2) {
			e.setSalary(e.getSalary()+200);
		}
		
		//3.Filtrar los que tengan una longitud mayor a 6 en su nombre
		List<Employee> listaEmp3 = new ArrayList<>();
		for (Employee e: listaEmp2) {
			if (e.getNombre().length()>6)
				listaEmp3.add(e);
		}
		
		for (Employee e: listaEmp3) {
			System.out.println(e);
		}
		
		//4.Ordernar por nombre
		//5.Obtener una lista de los nombres: List<String> nombres

		
		
	}

}
