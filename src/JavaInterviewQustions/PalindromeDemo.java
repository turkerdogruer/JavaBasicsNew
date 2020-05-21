package JavaInterviewQustions;

public class PalindromeDemo {
public static void main(String[] args) {
	String PalindromeWords = "level";//String variable	
	int	startPosition = 0;			//start position, startPosition = 0; because string start at 0 . 
	int endPosition = PalindromeWords.length()-1; //length over string we need endPosition in palindrome and we have to say "-1" 
										      //WE SAY -1 TO indicate the last character (char) in the String 
	boolean isPalindrome = true;//we use Boolean to indicate  whether the WORD that we use is palindrome or not (True or Flase)


	while (startPosition < endPosition) {
			//Thats Why we are going to create little subString variables that will test two letters are equal each other
	String startLetter = PalindromeWords.substring(startPosition, startPosition+1); //we will end at thestartPosition+1
	String lastLetter = PalindromeWords.substring(endPosition, endPosition+1); 
												//What left to do is know , we compare if they are eqaul by usin equals method()  
	if(startLetter.equals(lastLetter)==false) { //WE TEST HERE!! if the equals method() returns false, if it is false
		// we are going break our loop and indicate that is false not palindrome word. 
		isPalindrome=false;
		break;
	}
	startPosition++;
	endPosition--;
		// startPosition has to be smaller thn endPosition so that way we can compare the first letter and last latter and.. 
		//continue to first latter to the last latter, just to meet at the center we use startPosition++; endPosition--;
}		//(WHILE LOOP )==>which will allow us to continue doing sumthing or running while. 
if (isPalindrome==true) {
	System.out.println(PalindromeWords + " The word is Palindrome ");
}
else {
System.out.println(PalindromeWords + "is not Palindrome");
}
}
}

