package com.curso.v0;

class Person {
	String name = "No name";

	public Person(String nm) {
		name = nm;
	}
}

class Employee extends Person {
	String empID = "0000";

	public Employee(String id) {
		super(id);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("4321");
		System.out.println(e.empID);
	}
}
