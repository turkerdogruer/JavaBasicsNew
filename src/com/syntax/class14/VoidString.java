package com.syntax.class14;

public class VoidString {
	void greet() {
		System.out.println("Hello");
	}

	void greet1(String name) {
		System.out.println("Hello" + name);
	}

	public static void main(String[] args) {
		
		VoidString object1=new VoidString();
object1.greet1(" Turker");
object1.greet1(" Yunus");
object1.greet1(" Gulsum");
object1.greet1(" Selma");
object1.greet1(" Reyhan");
object1.greet1(" Senel");

	}
}