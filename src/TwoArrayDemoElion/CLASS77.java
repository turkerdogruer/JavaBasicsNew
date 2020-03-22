package TwoArrayDemoElion;

import java.util.Arrays;

public class CLASS77 {
	public static void main(String[] args) {
		int[] numbers = { 56, 89, 46, 77, 29, 39 };
		Arrays.sort(numbers);
		System.out.println("Smalles " + numbers[0]);
		System.out.println("Biggest " + numbers[numbers.length - 1]);
		System.out.println("Second Largest " + numbers[numbers.length - 2]);

		System.out.println("----2WAY-----");

		int[] numbers2 = { 56, 89, 46, 77, 29, 39 };

		int smallest = numbers2[0];
		int largest = numbers2[0];
		int secondlargest = numbers2[0];

		for (int i = 0; i < numbers2.length; i++) {
			int element = numbers2[i];
			if (element > largest) {
				secondlargest = largest;
				secondlargest = element;
			} else if (element > secondlargest) {

			}
			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println("Smalles " + smallest);
		System.out.println("Biggest " + largest);
		System.out.println("Second Largest " + secondlargest);
	}
}
