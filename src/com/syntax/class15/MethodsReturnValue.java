package com.syntax.class15;

public class MethodsReturnValue {
	public static void main(String[] args) {
		String str = "Hello my friend";
		int length = str.length();
		
		if (length>10) {
		System.out.println("String is to long");	
		}else {
			System.out.println("String is short");
		}
		
		MethodsReturnValue obj = new MethodsReturnValue();
		//obj.isLarger(10,20); 
	}
}
