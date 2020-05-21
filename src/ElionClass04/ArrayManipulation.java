package ElionClass04;

public class ArrayManipulation {
	public int largestNumber(int[] array) {

		int largest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}

	int smallestNumber(int[] array) {
		int smallest = array[0];
		for (int num : array) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 6, 1, 8 };
		ArrayManipulation manip = new ArrayManipulation();
		int largest = manip.largestNumber(array);
		System.out.println("largest is " + largest);
	}
}
