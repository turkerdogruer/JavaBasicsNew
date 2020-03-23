package com.syntax.class15;

public class Google {
	int empId;
	double salary;

	String name, lastName, title;

	void working() {
		System.out.println();
	}

	void getPaid() {
		System.out.println();
	}

	void attendMeetings() {
		System.out.println();
	}

	public static void main(String[] args) {
Google emp1=new Google();
emp1.empId=123;
emp1.name="Turker";
emp1.lastName="Dogruer";
emp1.title="CEO";
emp1.salary=200000;
emp1.working();
emp1.getPaid();
emp1.attendMeetings();

//second object create

Google emp2 = new Google();
emp1.empId=124;
emp1.name="Seyma";
emp1.lastName="Atasoy";
emp1.title="PO";
emp1.salary=100000;
emp1.working();
emp1.getPaid();
emp1.attendMeetings();
	}
}
