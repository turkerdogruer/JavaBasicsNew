package TwoArrayDemoElion;

public class CLASS442dAdvancedFor {
	public static void main(String[] args) {
		int[][] numara = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
 
		
		for (int [] row : numara) {
			
			
			for (int element : row) {
				System.out.print(element + " ");
				//sum+=element;
			}
			
			System.out.println( );
		}
	}
}
