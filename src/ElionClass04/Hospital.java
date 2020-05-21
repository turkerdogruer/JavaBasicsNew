package ElionClass04;

public class Hospital {
private static final String Mehmet = null;

public static void main(String[] args) {
	Doctor doctor1;
	doctor1 = new Doctor(" Turker Dogruer ", "1230",230000);
	
//doctor1.name = "Turker Dogruer";
//doctor1.licenceId = "1230";
//doctor1.salary= 230000;
//doctor1.displayPat();
//doctor1.chargePat();
//doctor1.TreatPatient();

System.out.println("Doctor name " +doctor1.name);
doctor1.displayPat();
//doctor1.chargePat();
doctor1.TreatPatient("Funda Dogruer" );

Doctor doctor2 = new Doctor("Mehmet OZ" , "34512", 400000);
doctor2.displayPat();

Doctor doctor3 = new Doctor("Mary James", "123131", 500000);
doctor3.displayPat();

}
}
