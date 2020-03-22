package TwoArrayDemoElion;

public class CLASS66manipulation {
public static void main(String[] args) {
	String str = "SELAMLAR";
	//int length = str.length();
	 System.out.println(str.length());
	 System.out.println(str.toUpperCase());
	
	 System.out.println(str);
	 System.out.println(str.toLowerCase());
	 
	 System.out.println(str.equals("MERHABA!"));
	 System.out.println(str.equalsIgnoreCase("MERHABA"));
	 
	 boolean starts = str.startsWith("he");
	 
	 System.out.println("str.startWith (he)--> " + starts);
	 System.out.println(str.endsWith("BA"));
	 
	 //METHOD CHANINING
	 
	 char fifthCharacter = str.charAt(4);
	 System.out.println(fifthCharacter);
	 
	 String reverse = "";
	 
	 char [] CharArray = str.toCharArray();
	 for (int i = CharArray.length-1; i>=0;  i--) {
		// System.out.println(CharArrayi[]);
		 reverse +=CharArray[i];
	 }
	 System.out.println(" reverese is--->" + reverse);
	 
	 int index = str.indexOf("HAB");
	 System.out.println(index);
	 
	 String Ornegi= "BIRSEYLER YAZALIM";
	 int index2 = Ornegi.indexOf("S", 6);
	 System.out.println(index2);
	 
	 
}
}
