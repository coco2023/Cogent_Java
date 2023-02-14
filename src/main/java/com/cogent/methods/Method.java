package com.cogent.methods;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Keyu";
		System.out.println(str);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.substring(1, 3));
		System.out.println(str.intern());
		// https://www.javatpoint.com/java-string-intern  intern()
		System.out.println(str.equals("Keyu"));
		String str2 = str.intern();
		String str3 = new String("Keyu");
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str.toUpperCase());
		System.out.println("Finish");
	}

}
