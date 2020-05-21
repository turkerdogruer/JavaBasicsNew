package com.syntax.class17;

public class StaticKeyword {
	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	static void displayGeneralInfo() {
		System.out.println("we are builduing  " + brand + " with touch screen  " + touchScreen);
	}

	 void displaySpecification() {
		System.out.println("We build pone  " + memory + " GB memory  in " + color + "color");
	}

	public static void main(String[] args) {
		

	}
}
 //Static Method cannot access non-static of the class. 