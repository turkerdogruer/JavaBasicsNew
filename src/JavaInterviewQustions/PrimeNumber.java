package JavaInterviewQustions;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrime(8));
	}
//
//	public static boolean numbercik(int num1) {
//
//		for (int i = 2; i < num1; i++) {
//			if (num1 % i == 0) {
//				
//				return true;
//			}
//
//			
//		}
//		return false;
//	}

	public static boolean isPrime(int numara) {
		if (numara <= 1) {
			System.out.println("given number is not prime " );
			return false;
		}
		for (int i = 2; i < numara; i++) {
			if (numara % i == 0) {
				System.out.println("given number is not prime " );
				
				
				return false;
			}
		}
		System.out.println("given number is prime " );
		return true;
	}
}