package ElionClass04;

public class Doctor {

	static String hospitalName;
	String name;
	String licenceId;
	int salary;
	
	String adress;
	
	public Doctor() {
		super();
	}

	public Doctor(String doctorName, String doctorLicenceId, int doctorSalary) {
		this.name = doctorName;
		this.licenceId = doctorLicenceId;
		this.salary = doctorSalary;
		System.out.println("something");
	}

	public void checkUp() {
		System.out.println(" Doctor " + name + " has order blood test.");

	}

	public void TreatPatient(String PatienName) {
		checkUp();
		System.out.println("Doctor" + this.name + " gives presp" + PatienName);
		this.chargePat();
	}

	public void chargePat() {
		System.out.println("Lemme charge $ 200.");
	}

	public void displayPat() {
		System.out.println("Doctor" + name + " with liceneId" + licenceId);
	}
}
