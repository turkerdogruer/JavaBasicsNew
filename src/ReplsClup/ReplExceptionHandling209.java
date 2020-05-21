package ReplsClup;

public class ReplExceptionHandling209 {
	/*
	 * Create a method that will do temperature check. Anytime user passes
	 * temperture that is below 32 method should throw an Exception saying
	 * "It is freezing"
	 * 
	 * In Main method call the method and handle an Exception
	 */

	public static void tempCheck(int temp) {

		if (temp < 32) {
			throw new RuntimeException("It is freezing");
		}

	}
	public static void main(String[] args) {
		try {
			tempCheck(31);
		}catch(RuntimeException exc) {
			System.out.println(exc);
		}
	}
}
