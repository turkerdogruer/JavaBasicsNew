package com.syntax.class16;

public class MethodRecap {
	int getLargestNumber(int[] array) {
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {

				largest = array[i];
			}
		}
		return largest;
	}

	String[] getWordsFromString(String str) {
		String[] array = str.split(" ");
		return array;
	}

	public static void main(String[] args) {
		MethodRecap obj = new MethodRecap();

		int[] arr = { 10, 20, 38, 12 };

		System.out.println(obj.getLargestNumber(arr));

		String myString = "it is a beatiful world ";
		String[] words = obj.getWordsFromString(myString);
	}
}