package ElionClass04;

import java.util.*;

public class MapIntro {
	public static void main(String[] args) {

		//                    Map
		
		// HashMap       LinkedHashMap      TreeMap HashTable

		Map<Integer, String> phoneBook = new HashMap<>();
		phoneBook.put(1214313, "Turker Dogruer");
		phoneBook.put(2131312, "Ali Osman");
		phoneBook.put(1231313, "Hasan Kaldiran");
		phoneBook.put(7867868, "Barak Obama");
		phoneBook.put(4537898, "Brad Pitt");
		phoneBook.put(3461414, "Kemal Sunal");

		// phoneBook.get(3461414);
		// System.out.print(phoneBook);
		String name = phoneBook.get(3461414);
		System.out.println(name + " is calling ");

		boolean contains = phoneBook.containsKey(898);
		System.out.println(4537 + " is in the map : " + contains);

		boolean contains2 = phoneBook.containsValue("Ali Osman");
		System.out.println("Turker Dogruer is in my contact list " + contains2);

		phoneBook.remove(2131312);

		System.out.println(phoneBook);

		phoneBook.isEmpty();

		// Most important part of a Map Here (Understan here) !!
		// Can I iterate normally no ,
		// But Map allow us to do it throguh keys, because keys are uniqe

		Set<Integer> keys = phoneBook.keySet();
		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			Integer key = it.next();

			String value = phoneBook.get(key);
			System.out.println(key + "-->" + value );
		}
		
		System.out.println("========");

		Collection<String> values = phoneBook.values();
		for (String value : values) {

			System.out.println(value);
			

		}
	}
	// Get all values

}
