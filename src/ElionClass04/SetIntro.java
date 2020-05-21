package ElionClass04;

import java.util.*;

public class SetIntro {
	public static void main(String[] args) {
		// Collection
		// List Set |Queue
		// ArrayList LinkedList | HashSet LinkedList TreeSet

		Set<String> Turkey = new HashSet<>();
		Turkey.add("Ankara");
		Turkey.add("Istanbul");
		Turkey.add("Konya");
		Turkey.add("Izmir");
		Turkey.add("Bursa");
		System.out.println(Turkey);

		Set<String> Turkey1 = new HashSet<>(Turkey);
		System.out.println(" HashSet " + Turkey1);

		Set<String> Turkey2 = new TreeSet<>(Turkey);
		System.out.println(" TreeSet " + Turkey2);

		Turkey1.size();
		Turkey1.contains("Konya");
		Turkey1.isEmpty();
		Turkey1.remove("Izmir");
		Turkey1.add("Kayseri");
		boolean contains = Turkey1.contains("Ankara");
		boolean isEmpty = Turkey1.isEmpty();
		boolean ableRemove = Turkey1.remove("Bursa");
		int size = Turkey1.size();

		for (String country : Turkey1) {
			System.out.print(country + " ");
		}

		System.out.println();
		
		// No idex so there is no for loop here in ( SET ).
		Iterator<String> it = Turkey1.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.print(country + " ");
			
		}
		System.out.println();
			
			
		Set<String> usa = new HashSet<>();
		usa.add("Texas");
		usa.add("Newyork");
		usa.add(null);
		usa.add("Alabama");
		usa.add("California");
		usa.add(null);
		
		
		System.out.println(usa);
			

		}
	}

