package ElionClass04;

public class Phone1 {
	private String serialNum;
	private String brand;
	private double price;
	private String pasword;
	
	public Phone1(String serialNum, String brand) {
		this.serialNum = serialNum;
		this.brand = brand;

		}
	public void displayInfo() {
		System.out.println("This is " + this.brand + " phone with serial number " + "");
		System.out.println();
	}
}
