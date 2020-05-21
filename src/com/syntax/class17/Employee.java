package com.syntax.class17;

public class Employee {
	static String title;
	public static Employee obj1;
	String name;
	protected String lasName;
	double salary;
	private long ssn;

	public void method1() {
		System.out.println("I am public method");

	}

	protected void method2() {
		System.out.println("I am protected method");
	}

	void method3() {
		System.out.println("I am default method");
	}

	private void method4() {
		System.out.println("I am private method");
		
	
	}
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.lasName = "turker";
		emp.lasName= "Dogruer";
		emp.salary = 10000;
		emp.ssn = 1313213123;
		
		
		
		
		
		
		
		
		
	}
}