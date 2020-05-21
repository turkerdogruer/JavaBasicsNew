package com.syntax.class17;

public class AccessingMembersOfDifferentClass {
	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.name = "Ahmet";// preferable 
		
		
		// emp.lastName--> protected
		// emp.salary--> default
		// emp.ssn--->private

		emp.method1(); // Not preferable
		// emp.method2();--->protected
		// emp.method3();--->default
		// emp.method4();--->private

	}

}
//I have to be in the same package within the same class, 
// acces modifiers public, protected, private, 
//onnly public accecible anywhere