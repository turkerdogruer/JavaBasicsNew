package com.syntax.class18;

public class Car {
	String make, model, color;
	int year;
	
	//Constructor 
	public Car() {
		make="BMW";
		model = "x5";
		color = "black";
		year = 2020;
	}
	

	public void Details() {
		System.out.println("I have " + year + make + " " + model + " in " + color);
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.year);
	}
}
