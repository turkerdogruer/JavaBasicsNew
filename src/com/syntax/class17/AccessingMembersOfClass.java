package com.syntax.class17;

public class AccessingMembersOfClass {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.name = "Yunus";
		emp.lasName = "Pasa";
		emp.salary = 120000;
		// emp.ssn=31232131; //Not accessiable cause this is private error you will have
		// accessing static method
		emp.method1();
		emp.method2();
		emp.method3();
		// emp.method4();//is not visable private)
	}
}
