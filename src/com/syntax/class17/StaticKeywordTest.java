package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {

		StaticKeyword.brand = "Android";
		StaticKeyword.touchScreen = true;
		StaticKeyword.displayGeneralInfo();

		StaticKeyword ab = new StaticKeyword();
		ab.color = "red";
		ab.memory = 64;
		ab.displaySpecification();
		
		
		StaticKeyword ab1 = new StaticKeyword();
		ab1.color = "red";
		ab1.memory = 128;
		ab1.brand = "Nokia";
		
		ab1.displayGeneralInfo();
		ab.displayGeneralInfo();
	}
}