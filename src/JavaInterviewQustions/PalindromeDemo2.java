package JavaInterviewQustions;

public class PalindromeDemo2 {

	public static void main(String[] args) {

		System.out.println(isPalendirom("level"));

	}

	public static boolean isPalendirom(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);

	}
}