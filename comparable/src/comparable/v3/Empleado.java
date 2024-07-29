package comparable.v3;

public class Empleado implements Comparable<Empleado> {
	
	String nombre;
	int edad;
	double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		return this.nombre.compareTo(o.nombre);
	}

}
