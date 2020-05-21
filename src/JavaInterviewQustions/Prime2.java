package JavaInterviewQustions;

public class Prime2 {
	public static void main(String[] args) {
		System.out.println(sayi(7));
	}

	public static boolean sayi(int num) {
		if (num <= 1) {
			System.out.println("the number is not prime");
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("The number is not prime ");
				return false;
			}

		}
		System.out.print("The number is sapina kadar prime ");
		return true;
	}
}