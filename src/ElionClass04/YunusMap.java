package ElionClass04;

import java.util.Iterator;
import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class YunusMap {
	public static void main(String[] args) {
		Map<Integer, String> phoneBook = new HashMap<>();
		phoneBook.put(123456789, "John Smith");
		phoneBook.put(198473983, "James London");
		phoneBook.put(798346943, "Rohani Smith");
		phoneBook.put(184729038, "Donald Trump");
		phoneBook.put(111111111, "Obama");
		phoneBook.put(498374934, "Brad Pitt");
		phoneBook.put(798346943, "Julia Roberts");
		String name = phoneBook.get(123456789);
		System.out.println(name + " is calling");
		String name2 = phoneBook.get(129546789);
		System.out.println(name2 + " is calling ");
		boolean contains = phoneBook.containsKey(5555);
		System.out.println(5555 + " is in the map: " + contains);
		System.out.println("Julia roberts is in my phone book : " + phoneBook.containsValue("Julia Roberts"));
		// will remove trump
		phoneBook.remove(184729038);
		System.out.println(phoneBook);
		System.out.println("-------------------------------");
		///////////////////////////////////////////////////////////////////////
		// get all the keys
		Set<Integer> keys = phoneBook.keySet();
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String value = phoneBook.get(key);
			System.out.println(key + " -> " + value);

		}
		System.out.println("------------------------------");
		// lets get all the values

		Collection<String> values = phoneBook.values();

		for (String x : values) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		// lets get all entries1. way

		for (Map.Entry<Integer, String> list : phoneBook.entrySet()) {
			System.out.println(list.getKey() + " " + list.getValue());
		}
		System.out.println("-----------------------------------------");
		// second way
		Set<Entry<Integer, String>> list1 = phoneBook.entrySet();
		System.out.println(list1);
		for (Entry<Integer, String> x : list1) {
			System.out.println(x.getKey() + " ----> " + x.getValue());
		}
		System.out.println("------------iterator way-------------");

		Iterator<Entry<Integer, String>> ite = list1.iterator();
		while (ite.hasNext()) {
			Entry<Integer, String> x = ite.next();
			System.out.println(x.getKey() + " " + x.getValue());
		}
		System.out.println("------------lambda-------------");
		phoneBook.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
	}
}
