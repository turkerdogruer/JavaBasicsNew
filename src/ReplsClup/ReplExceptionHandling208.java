package ReplsClup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*Create a method that will not be handling exception and throwing it at caller.
/*In main method call method and handle the exception.*/

public class ReplExceptionHandling208 {
	public static void method1(String FileNotExcep) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(FileNotExcep);

	}
	public static void main(String[] args) {
		
		try {
		     method1(""); //saricizmeli mehmet aga
		}catch(FileNotFoundException FnException) {
			System.out.println(FnException);
		}
	}
}
