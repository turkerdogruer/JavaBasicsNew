package com.syntax.class15;

public class Task1 {

	void bigNum(int a, int b) {
		if (a > b) {
			System.out.println(a + " is bigger than " + b);
		} else {
			System.out.println(b + " is bigger than " + a);
		}
	}

	void evenNum(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " is odd number");
		}

	}

	void palin(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		System.out.print(reverse);
		if (word.equals(reverse)) {
			System.out.println(" is a palidrome");
		} else {
			System.out.println(" is Not a palindrome");
		}

	}

	void lang(String word) {
		switch (word) {
		case "Russia":
			System.out.println("Privet");
			break;
		case "Tajikistan":
			System.out.println("Salom");
			break;
		case "Mexico":
			System.out.println("hola");
			break;
		default:
			System.out.println("wrong language");

		}
	}

	public static void main(String[] args) {
		Task1 obj = new Task1();

		obj.palin("abba");
		obj.bigNum(30, 40);
		obj.evenNum(41);
		obj.lang("Tajikistan");

	}
}
