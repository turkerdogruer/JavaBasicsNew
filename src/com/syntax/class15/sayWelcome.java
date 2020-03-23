package com.syntax.class15;

public class sayWelcome {
	void sayWelcom() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Welcome");
		}
	}

	void sayAnything(String word, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.println(word);
		}
	}

	void isItraining(boolean isRain) {

		if (isRain) {

			System.out.println("stay home");

		} else {

			System.out.println("you can go out");
		}

	}
}
