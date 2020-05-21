package JavaInterviewQustions;

public class PrimeNumber3 {
	public static void main(String[] args) {
System.out.println(isPrime(5));
	}

	public static boolean isPrime(int num3) {
		if (num3 <= 1) {
			System.out.println("is not prime");
			return false;
		}
		for (int i = 2; i < num3; i++) {
			if (num3 % i == 0) {
				System.out.println(" is not prime ");
				return false;
			}

		}

		System.out.println(" sapina kadar prime ");
		return true;
	}
}