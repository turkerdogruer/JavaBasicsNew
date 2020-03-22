package TwoArrayDemoElion;

public class CLASS55sum {
	public static void main(String[] args) {
		int[][] numara = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		int[] sum = new int[numara.length];

		for (int row = 0; row < numara.length; row++) {
			for (int col = 0; col < numara[row].length; col++) {
				int element = numara[row][col];
				sum[row] += element;
			}

		}
		for (int element : sum) {
			System.out.println(("sum is  " + element));
		}
	}

}
