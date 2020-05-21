package ElionClass04;

public class School {
	public static void main(String[] args) {
	MathOperations math = new MathOperations();
	
	int result = math.add(4, 5);
	
	System.out.println("Result is " + result);
	
	math.add2(4, 5);
	
	System.out.println(math.add (5,2));
	
	result = math.multiply (3,4);
	}
}
