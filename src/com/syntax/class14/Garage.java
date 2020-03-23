package com.syntax.class14;

public class Garage {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "AMG 65";
		car1.year = 2020;
		car1.color = "black";

		Car car2 = new Car();
		car2.make = "Mazda";
		car2.model = "CX9";
		car2.year = 2019;
		car2.color = "silver";

		Car car3 = new Car();
		car3.make = "Seat";
		car3.speed = 200;

		System.out.println(car2.year);

		// Accesing behaviour/Methods of cars.

		car1.drive();
		car1.accelarate();
		car1.makeNoise();
		car1.stop();
		
		car2.drive();
		car2.stop();
		car3.makeNoise();
		car3.accelarate();
		
		// car3.breaking(); method is not defined in the class. 
		
	}
}
