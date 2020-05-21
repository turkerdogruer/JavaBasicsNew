package JavaInterviewQustions;

public class prime {

	public static void main(String[] args) {

		System.out.println(Prime(8));

	}

	public static boolean Prime(int numara) {
		if (numara <= 1) {
			System.out.println("This is not prime number ");
			return false;
		}

		for (int i = 2; i < numara; i++) {

			if (numara % i == 0) {
				System.out.println("This is not prime ");
				return false;
			}
		}
		System.out.println("This is prime");
		return true;
	}

}
