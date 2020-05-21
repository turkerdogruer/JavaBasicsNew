package JavaInterviewQustions;

public class PrimePolindromeReverse {

	public static void main(String[] args) {
		isPrime(8);
		System.out.println(isPalindrome("kayak"));
		reverseString("ahmet");
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			System.out.println("Number is not prime ");
			return false;

		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("The number is not prime");
				return false;
			}

		}

		System.out.println("The number is prime");
		return true;
	}

	public static boolean isPalindrome(String str) {
		StringBuilder obj = new StringBuilder();
		obj.reverse().toString().equals(str);
		return true;
	}

	public static boolean isPolindrome(String str) {

		return new StringBuilder(str).reverse().toString().equals(str);

	}
	
	public static void reverseString (String str) {
		String reverse = "";
		for(int i = str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
			
		}
		System.out.println(reverse);
	}
}
