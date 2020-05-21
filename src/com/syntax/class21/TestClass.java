package com.syntax.class21;

public class TestClass {
public static void main(String[] args) {
	MathTeacher mt = new MathTeacher("Funda" ,"Dogurer");
	System.out.println(mt.name);
	
	MathTeacher mt2 = new MathTeacher("Ali" ,"Dogurer");
	System.out.println(mt2.name);
	
	JavaTeacher Java = new JavaTeacher("Tekin","Dogruer");
	System.out.println(Java.name);
}
}
