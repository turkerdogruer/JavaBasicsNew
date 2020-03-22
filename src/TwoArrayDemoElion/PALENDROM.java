package TwoArrayDemoElion;

public class PALENDROM {
	public static void main(String[] args) {
		String str = "KAYAK";

		String reverse = "";
		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse += charArray[i];
		}
		System.out.println("word is = " + str);
		System.out.println("reverse is = " + reverse);

		if (str.equals(reverse)) {
			System.out.println("Yes, it is a palin");
		} else {
			System.out.println("No, it is not a palin");
		}
		
		//HW use chart to find if it is a palindrome.
	}
}
