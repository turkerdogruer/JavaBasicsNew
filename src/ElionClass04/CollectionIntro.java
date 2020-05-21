package ElionClass04;

import java.util.*;
                            // 
public class CollectionIntro {

	public static void main(String[] args) {

		ArrayList<String> europe = new ArrayList<String>(); // empty arraylist
		ArrayList<String> asia = null;// we dont have object yet

		europe.add("Albenia");
		europe.add("France");
		europe.add("Germany");
		europe.add("Spain");
		europe.add("England");
		
		System.out.println("Europe size is " + europe.size());
		
		europe.remove("England");
		
		System.out.println("Europe size is " + europe.size());
		System.out.println("Europe is empty" + europe.isEmpty());
		
		for (int i = 0; i<europe.size(); i++) {
			String country  = europe.get(i);
			System.out.print(country + " ");
		}
		System.out.println();
		for (String country : europe) {
		System.out.println(country + " ");	
		}
		Iterator<String> it = europe.iterator();
		it.next();
		it.hasNext();
		it.remove();
	}

}
