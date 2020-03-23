package com.syntax.class14;

public class Dog {
	String breed;
	String color;
	String name;
	int age;

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Kangal";
		dog1.color = "White";
		dog1.name = "Kopek";
		dog1.age = 2;

		dog1.bark();
		dog1.eat();
		dog1.run();

		Dog dog2 = new Dog();
		dog2.breed = "Pitbul";
		dog2.color = "Black";
		dog2.name = "KucuKucu";
		dog2.age = 2;

		dog2.bark();
		dog2.eat();
		dog2.run();
	}

	void bark() {
		System.out.println(); // Method bark
	}

	void eat() {
		System.out.println(); //Method run
	}

	void run() {
		System.out.println(); //Method
	}
}
//TOP TO THE BOTTOM ONLY IN MAIN METHOD!!
