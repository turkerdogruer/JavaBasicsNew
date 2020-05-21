package ReplsClup;

public class ReplExceptionHandling207 {
public static void main(String[] args) {
		
		int [] num1 = {3,5,8};
		try {
			System.out.println(num1[4]);
		}catch(ArrayIndexOutOfBoundsException ArrayIndexOutExcp) {
			ArrayIndexOutExcp.printStackTrace();
			
		}
		
	}
}
