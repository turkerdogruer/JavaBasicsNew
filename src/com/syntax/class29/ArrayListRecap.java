package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListRecap {
	public static void main(String[] args) {
		ArrayList<Double> alist = new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		System.out.println(alist);

		alist.set(1, 13.90);
		System.out.println(alist);

		alist.remove(13.90);
		System.out.println(alist);

		System.out.println((alist.get(1)));

		for (double a : alist) {
			System.out.println(a);
		}

		// 2. for loop regular for loop
		for (int i = 0; i < alist.size(); i++) {
			double d = alist.get(i);
			System.out.println(d);

			// iterator
		}

		System.out.println("====Non Generic Collection");

		ArrayList obj = new ArrayList();
		obj.add("hello");// store single object
		obj.add(100);
		obj.add('c');
		obj.add("hello");
		obj.add(alist);// store collection object

		for (Object o : obj) {
			System.out.println(o);
		}
	}
}
