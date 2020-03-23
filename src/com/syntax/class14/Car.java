package com.syntax.class14;

public class Car {
	// Define feature of the car

	public String make;
	public String model;	
	public int year;
	public int speed;
	public String color;

	// Define behavior

	void drive() {
		System.out.println(make + " can drive");
	}

	void accelarate() {
		System.err.println(make + " can accelerate");
	}

	void makeNoise() {
		System.out.println(make +" make noise");
	}

	void stop() {
		System.out.println(make + " Car stops");
		System.out.println("Car stops when you push the break");
	}
}
