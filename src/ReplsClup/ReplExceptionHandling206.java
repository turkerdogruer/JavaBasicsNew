package ReplsClup; //ReplExceptionHandling206

class ReplExceptionHandling206 {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int result;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e/*.getMessage*/);
		}
	}
}
